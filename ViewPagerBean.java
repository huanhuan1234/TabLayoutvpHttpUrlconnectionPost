package bawei.com.a20170429_yuekaoa.bean;

import java.util.List;

/**
 * Created by huanhuan on 2017/5/1.
 */

public class ViewPagerBean {

    /**
     * ret_code : 200
     * ret_msg : ok
     * listViewPager : ["https://img10.360buyimg.com/da/jfs/t4747/277/1368712300/170619/35098d7f/58f038e0N9b3a0ca5.jpg","https://img14.360buyimg.com/da/jfs/t4915/21/1427207714/81116/b005bb06/58f08963Ndb295b3c.jpg","https://img13.360buyimg.com/da/jfs/t4651/104/2867456043/68336/99da4c16/58f41eaeN5b614a63.jpg"]
     * list : [{"date":"1小时前","id":3,"pic":"http://img02.tooopen.com/images/20140504/sy_60294738471.jpg","title":"《人民的名义》观后感：郑胜利居心不良，高育良地下情曝光","type":1},{"date":"3小时前","id":5,"pic":"http://pic28.nipic.com/20130424/11588775_115415688157_2.jpg","title":" \n中国女乒惨败，孔令辉向日本低头认输，却遭刘国梁一语打脸","type":1},{"date":"7小时前","id":8,"pic":"http://img4.imgtn.bdimg.com/it/u=819201812,3553302270&fm=23&gp=0.jpg|http://img0.imgtn.bdimg.com/it/u=3597382613,1842885761&fm=23&gp=0.jpg|http://img2.imgtn.bdimg.com/it/u=965330022,2254577156&fm=23&gp=0.jpg","title":"镜头中的中朝边境，两人背对背却在不同的国家","type":2},{"date":"8小时前","id":9,"pic":"http://img4.imgtn.bdimg.com/it/u=819201812,3553302270&fm=23&gp=0.jpg|http://img0.imgtn.bdimg.com/it/u=3597382613,1842885761&fm=23&gp=0.jpg|http://img2.imgtn.bdimg.com/it/u=965330022,2254577156&fm=23&gp=0.jpg","title":" \n美女隐居山林20年，生活清苦似原始人，变成大妈终不悔","type":2},{"date":"9小时前","id":10,"pic":"http://img4.imgtn.bdimg.com/it/u=819201812,3553302270&fm=23&gp=0.jpg|http://img0.imgtn.bdimg.com/it/u=3597382613,1842885761&fm=23&gp=0.jpg|http://img2.imgtn.bdimg.com/it/u=965330022,2254577156&fm=23&gp=0.jpg","title":"镜头下：1976年唐山发生7.8级大地震后的真实写照","type":2},{"date":"2分钟前","id":12,"pic":"http://img0.imgtn.bdimg.com/it/u=2065983538,3619554480&fm=23&gp=0.jpg","title":"40个生活小技巧，助你变身生活达人！","type":1},{"date":"10分钟前","id":16,"pic":"http://img4.imgtn.bdimg.com/it/u=819201812,3553302270&fm=23&gp=0.jpg|http://img0.imgtn.bdimg.com/it/u=3597382613,1842885761&fm=23&gp=0.jpg|http://img2.imgtn.bdimg.com/it/u=965330022,2254577156&fm=23&gp=0.jpg","title":"90后女孩辞职做代孕赚20万 供两个妹妹上大学","type":2},{"date":"2小时前","id":19,"pic":"http://p9.pstatp.com/list/190x124/ef7000c2947b313fe05","title":" \n为什么越来越多的人会选择关闭朋友圈？","type":1}]
     */

    private int ret_code;
    private String ret_msg;
    private List<String> listViewPager;
    private List<ListBean> list;

    public int getRet_code() {
        return ret_code;
    }

    public void setRet_code(int ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public List<String> getListViewPager() {
        return listViewPager;
    }

    public void setListViewPager(List<String> listViewPager) {
        this.listViewPager = listViewPager;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * date : 1小时前
         * id : 3
         * pic : http://img02.tooopen.com/images/20140504/sy_60294738471.jpg
         * title : 《人民的名义》观后感：郑胜利居心不良，高育良地下情曝光
         * type : 1
         */

        private String date;
        private int id;
        private String pic;
        private String title;
        private int type;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
