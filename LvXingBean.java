package bawei.com.a20170429_yuekaoa.bean;

import java.util.List;

/**
 * Created by huanhuan on 2017/5/1.
 */

public class LvXingBean {
    /**
     * result : success
     * data : [{"ID":"26738753","TITLE":"1996年","SUBTITLE":"1996年1月9日 九三学社已故名誉主席茅以升诞辰100周年座谈会在北京举行。 ","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":22},{"ID":"26738752","TITLE":"1995年","SUBTITLE":"1995年1月4日 中共中央、九三学社中央领导同志祝贺社中央名誉主席严济慈95岁","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":23},{"ID":"26738750","TITLE":"1994年","SUBTITLE":"1994年1月4日\u201423日 九三学社徐采栋、赵伟之、金开诚、潘蓓蕾、谢丽娟、鞠庆","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":24},{"ID":"26738749","TITLE":"1993年","SUBTITLE":"1993年2月13日 社中央邀集九三学社部分科技界知名人士座谈科技体制改革问题，","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":25},{"ID":"26738748","TITLE":"1992年","SUBTITLE":"1992年1月6日 九三学社中央经济建设委员会召开农业问题座谈会。 1992年1","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":26},{"ID":"26738747","TITLE":"1991年","SUBTITLE":"1991年1月18日\u201420日 九三学社中央两次召开主席会议学习中共十三届七中全会","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":27},{"ID":"26738746","TITLE":"1990年","SUBTITLE":"1990年2月8日 许德珩逝世。许德珩（1890\u20141990），字楚生，江西九江人","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":28},{"ID":"26738745","TITLE":"1989年","SUBTITLE":"1989年3月28日\u201429日 九三学社八届二次会议在北京举行，会议通过决议，拥护","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":29},{"ID":"26738744","TITLE":"1988年","SUBTITLE":"1988年2月24日 九三学社中央研究室在北京召开\u201c政治体制改革和九三学社的任务","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":30},{"ID":"26738743","TITLE":"1987年","SUBTITLE":"1987年4月5日 九三学社中央第七届常委会第十一次会议（扩大）在北京举行。大会","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":31},{"ID":"26738742","TITLE":"1986年","SUBTITLE":"1986年1月4日\u20148日 九三学社全国工作会议在北京举行。研究讨论九三学社引进新","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":32},{"ID":"26738741","TITLE":"1985年","SUBTITLE":"1985年1月20日\u201430日 九三学社中央七届二中全会（扩大）暨全国为四化服务工","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":33},{"ID":"26738740","TITLE":"1984年","SUBTITLE":"1984年1月28日 九三学社中央举行春节茶话会，座谈祖国统一大业问题。 198","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":34},{"ID":"26738739","TITLE":"1983年","SUBTITLE":"1983年1月30日 王竹溪逝世。王竹溪（1911\u20141983），湖北公安县人，著","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":35},{"ID":"26738738","TITLE":"1982年","SUBTITLE":"1982年1月21日 九三学社中央和北京市分社联合举办迎春茶会，热烈祝贺人工合成","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":36},{"ID":"26738737","TITLE":"1981年","SUBTITLE":"1981年5月9日\u201415日 九三学社中央在天津召开宣传工作座谈会。 1981年5","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":37},{"ID":"26738736","TITLE":"1980年","SUBTITLE":"1980年1 月 九三学社中央机关刊物《红专》复刊。 1980年1月19日 九三","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":38},{"ID":"26738735","TITLE":"1979年","SUBTITLE":"1979年4月 九三学社中央召开全国工作会议。 1979年10月 吴藻溪逝世。吴","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":39},{"ID":"26738734","TITLE":"1978年","SUBTITLE":"1978年2月24日至3月8日 中国人民政治协商会议第五届全国委员会第一次会议在","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":40},{"ID":"26738733","TITLE":"1975年","SUBTITLE":"1975年1月31日 王卓然逝世。王卓然（1893\u20141975），字回波，号梦白，","IMAGEURL":null,"FROMNAME":null,"SHOWTIME":"2016-04-18","RN":41}]
     */

    private String result;
    private List<DataBean> data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * ID : 26738753
         * TITLE : 1996年
         * SUBTITLE : 1996年1月9日 九三学社已故名誉主席茅以升诞辰100周年座谈会在北京举行。
         * IMAGEURL : null
         * FROMNAME : null
         * SHOWTIME : 2016-04-18
         * RN : 22
         */

        private String ID;
        private String TITLE;
        private String SUBTITLE;
        private Object IMAGEURL;
        private Object FROMNAME;
        private String SHOWTIME;
        private int RN;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getTITLE() {
            return TITLE;
        }

        public void setTITLE(String TITLE) {
            this.TITLE = TITLE;
        }

        public String getSUBTITLE() {
            return SUBTITLE;
        }

        public void setSUBTITLE(String SUBTITLE) {
            this.SUBTITLE = SUBTITLE;
        }

        public Object getIMAGEURL() {
            return IMAGEURL;
        }

        public void setIMAGEURL(Object IMAGEURL) {
            this.IMAGEURL = IMAGEURL;
        }

        public Object getFROMNAME() {
            return FROMNAME;
        }

        public void setFROMNAME(Object FROMNAME) {
            this.FROMNAME = FROMNAME;
        }

        public String getSHOWTIME() {
            return SHOWTIME;
        }

        public void setSHOWTIME(String SHOWTIME) {
            this.SHOWTIME = SHOWTIME;
        }

        public int getRN() {
            return RN;
        }

        public void setRN(int RN) {
            this.RN = RN;
        }
    }
    //http://www.93.gov.cn/93app/data.do?channelId=1&startNum=21


}
