package bawei.com.a20170429_yuekaoa.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bawei.com.a20170429_yuekaoa.MyApplication;
import bawei.com.a20170429_yuekaoa.MyHttpUrlConnection;
import bawei.com.a20170429_yuekaoa.R;
import bawei.com.a20170429_yuekaoa.bean.BeanSheBean1;
import bawei.com.a20170429_yuekaoa.bean.LvXingBean;
import bawei.com.a20170429_yuekaoa.bean.ViewPagerBean;

/**
 * Created by huanhuan on 2017/5/1.
 */

public class FragmentInfo extends Fragment {

    private ListView lv;

    private List<BeanSheBean1.DataBean> list;
    private List<String> listViewPager;

    List<ImageView> imageViews = new ArrayList<ImageView>();

    private Handler handler = new Handler() {



        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {

                case 0:

                {
                    String result = (String) msg.obj;

                    BeanSheBean1 bean1 = JSON.parseObject(result, BeanSheBean1.class);

                    list = bean1.getData();

                    MyAdapter adapter = new MyAdapter();

                    lv.setAdapter(adapter);
                }

                break;

                case 1:

                {
                    //图片轮播
                    String result = (String) msg.obj;

                    ViewPagerBean bean = JSON.parseObject(result, ViewPagerBean.class);

                    listViewPager = bean.getListViewPager();



                    PagerAdapter adapter1 = new PagerAdapter() {
                        @Override
                        public int getCount() {
                            return Integer.MAX_VALUE;
                        }

                        @Override
                        public boolean isViewFromObject(View view, Object object) {
                            return view == object;
                        }

                        @Override
                        public void destroyItem(ViewGroup container, int position, Object object) {
//                super.destroyItem(container, position, object);

                            container.removeView((View) object);
                        }

                        @Override
                        public Object instantiateItem(ViewGroup container, int position) {

                            String url = listViewPager.get(position % listViewPager.size());

                            View view = View.inflate(getActivity(), R.layout.vp_item, null);

                            ImageView iv = (ImageView) view.findViewById(R.id.iv_vp);

                            iv.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {

                                    switch (event.getAction()) {

                                        case MotionEvent.ACTION_DOWN://按下

                                            handler.removeCallbacksAndMessages(null);

                                            break;

                                        case MotionEvent.ACTION_UP://抬起

                                            handler.sendEmptyMessageDelayed(3, 2000);

                                            break;

                                        case MotionEvent.ACTION_CANCEL://取消

                                            handler.sendEmptyMessageDelayed(3, 2000);

                                            break;

                                        case MotionEvent.ACTION_MOVE://移动

                                            handler.removeCallbacksAndMessages(null);

                                            break;


                                    }

                                    return true;
                                }
                            });

                            ImageLoader.getInstance().displayImage(url, iv);

                            container.addView(view);

                            return view;
                        }
                    };

                    vp.setAdapter(adapter1);
                    vp.setCurrentItem(listViewPager.size() * 10000);


                }


                break;

                case 3:

                    int currentItem = vp.getCurrentItem();

                    vp.setCurrentItem(currentItem+1);

                    handler.sendEmptyMessageDelayed(3, 2000);

                    break;
            }


        }
    };
    private MyApplication application;
    private ViewPager vp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_info, container, false);

        lv = (ListView) view.findViewById(R.id.fragment01_lv);

        application = (MyApplication) getActivity().getApplication();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        LayoutInflater lif = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = lif.inflate(R.layout.viewpager, lv, false);


        vp = (ViewPager) view.findViewById(R.id.viewpager);

        LinearLayout ll = (LinearLayout) view.findViewById(R.id.ll);

        lv.addHeaderView(view);

        postViewPager();

        post();



        handler.sendEmptyMessageDelayed(3, 2000);

        for (int i = 0; i < 3; i++) {

            ImageView iv = new ImageView(getActivity());

            if (i == 0) {
                iv.setImageResource(R.drawable.shape01);
            } else {
                iv.setImageResource(R.drawable.shape02);
            }

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(5, 0, 5, 0);

            ll.addView(iv, params);

            imageViews.add(iv);

        }

        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < imageViews.size(); i++) {
                    if (i == position % listViewPager.size()) {
                        imageViews.get(i).setImageResource(R.drawable.shape01);
                    } else {
                        imageViews.get(i).setImageResource(R.drawable.shape02);
                    }
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });





    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }


    public void postViewPager() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                Map<String, String> map = new HashMap<>();

                map.put("page", "1");

                map.put("type", "2");

                map.put("postkey", "1503d");

                MyHttpUrlConnection conn = new MyHttpUrlConnection("http://qhb.2dyt.com/Bwei/news", map, handler);

                conn.requsetViewPagerConnection();

            }
        }).start();

    }

    public void post() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                Map<String, String> map = new HashMap<>();

                map.put("channelId", "0");

                map.put("startNum", "0");

                //http://www.93.gov.cn/93app/data.do?channelId=0&startNum=0

                MyHttpUrlConnection conn = new MyHttpUrlConnection("http://www.93.gov.cn/93app/data.do", map, handler);

                conn.requsetConnection();

            }
        }).start();


    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public int getItemViewType(int position) {

            if (list.get(position).getIMAGEURL() != null) {//有图片
                return 0;
            } else {

                return 1;
            }

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolderOne one = null;
            ViewHolderTwo two = null;

            if (convertView == null) {

                if (getItemViewType(position) == 0) {//有图片

                    one = new ViewHolderOne();

                    convertView = View.inflate(getActivity(), R.layout.fragment_lv_item1, null);

                    one.ont_iv = (ImageView) convertView.findViewById(R.id.fragment01_iv);

                    one.one_tv_title = (TextView) convertView.findViewById(R.id.fragment01_title);
                    one.one_tv_subtitle = (TextView) convertView.findViewById(R.id.fragment01_subtitle);

                    convertView.setTag(one);

                } else {

                    two = new ViewHolderTwo();

                    convertView = View.inflate(getActivity(), R.layout.fragment_lv_item2, null);

                    two.two_tv_title = (TextView) convertView.findViewById(R.id.fragment02_title);
                    two.two_tv_subtitle = (TextView) convertView.findViewById(R.id.fragment02_subtitle);

                    convertView.setTag(two);

                }

            } else {
                if (getItemViewType(position) == 0) {
                    one = (ViewHolderOne) convertView.getTag();
                } else {

                    two = (ViewHolderTwo) convertView.getTag();
                }
            }

            if (getItemViewType(position) == 0) {

                one.one_tv_title.setText(list.get(position).getTITLE());

                one.one_tv_subtitle.setText(list.get(position).getSUBTITLE());

                ImageLoader.getInstance().displayImage(list.get(position).getIMAGEURL(), one.ont_iv, application.getOption());


            } else {

                two.two_tv_title.setText(list.get(position).getTITLE());

                two.two_tv_subtitle.setText(list.get(position).getSUBTITLE());

            }


            return convertView;
        }
    }

    class ViewHolderOne {
        ImageView ont_iv;
        TextView one_tv_title, one_tv_subtitle;
    }

    class ViewHolderTwo {
        TextView two_tv_title, two_tv_subtitle;
    }

}
