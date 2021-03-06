package com.jiyun.qcloud.dashixummoban.entity.homeentily;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/8/27.
 */

public class MovieBean {

    /**
     * ack : yes
     * asp_error_code : 0
     * cdn_info : {"cdn_code":"VOD-MP4-CDN-CNC","cdn_name":"3rd网宿","cdn_vip":"vod.cntv.lxdns.com"}
     * client_sid : 8cb4b283f83345ffab842124d250517c
     * column :
     * default_stream : HD
     * editer_name : wangbaoyan
     * embed :
     * f_pgmtime : 2017-08-25 19:35:20
     * hls_cdn_info : {"cdn_code":"VOD-HLS-CDN-CNC","cdn_name":"3rd网宿","cdn_vip":"asp.cntv.lxdns.com"}
     * hls_url : http://asp.cntv.lxdns.com/asp/hls/main/0303000a/3/default/47942576d8a84832ad98e83c8fe17b49/main.m3u8?maxbr=4096
     * is_fn_hot : true
     * is_fn_multi_stream : false
     * is_invalid_copyright : 0
     * is_ipad_support : true
     * is_p2p_use : false
     * is_protected : 0
     * lc : {"city_code":"","country_code":"CN","ip":"115.171.30.186","isp_code":"1","provice_code":"BJ"}
     * play_channel : 陕西卫视
     * produce :
     * produce_id : copyvd
     * public : 1
     * tag :
     * title : 陕西省再添一只人工繁育大熊猫
     * version : 0.2
     * video : {"chapters":[{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264818000nero_aac32.mp4"}],"chapters2":[{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h2641200000nero_aac128.mp4"}],"chapters3":[{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h2642000000nero_aac128.mp4"}],"chapters4":[{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264418000nero_aac32.mp4"}],"lowChapters":[{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264200000nero_aac16.mp4"}],"totalLength":"91.00","url":"","validChapterNum":5}
     */

    private String ack;
    private int asp_error_code;
    private CdnInfoBean cdn_info;
    private String client_sid;
    private String column;
    private String default_stream;
    private String editer_name;
    private String embed;
    private String f_pgmtime;
    private HlsCdnInfoBean hls_cdn_info;
    private String hls_url;
    private String is_fn_hot;
    private boolean is_fn_multi_stream;
    private String is_invalid_copyright;
    private String is_ipad_support;
    private boolean is_p2p_use;
    private String is_protected;
    private LcBean lc;
    private String play_channel;
    private String produce;
    private String produce_id;
    @SerializedName("public")
    private String publicX;
    private String tag;
    private String title;
    private String version;
    private VideoBean video;

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public int getAsp_error_code() {
        return asp_error_code;
    }

    public void setAsp_error_code(int asp_error_code) {
        this.asp_error_code = asp_error_code;
    }

    public CdnInfoBean getCdn_info() {
        return cdn_info;
    }

    public void setCdn_info(CdnInfoBean cdn_info) {
        this.cdn_info = cdn_info;
    }

    public String getClient_sid() {
        return client_sid;
    }

    public void setClient_sid(String client_sid) {
        this.client_sid = client_sid;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getDefault_stream() {
        return default_stream;
    }

    public void setDefault_stream(String default_stream) {
        this.default_stream = default_stream;
    }

    public String getEditer_name() {
        return editer_name;
    }

    public void setEditer_name(String editer_name) {
        this.editer_name = editer_name;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public String getF_pgmtime() {
        return f_pgmtime;
    }

    public void setF_pgmtime(String f_pgmtime) {
        this.f_pgmtime = f_pgmtime;
    }

    public HlsCdnInfoBean getHls_cdn_info() {
        return hls_cdn_info;
    }

    public void setHls_cdn_info(HlsCdnInfoBean hls_cdn_info) {
        this.hls_cdn_info = hls_cdn_info;
    }

    public String getHls_url() {
        return hls_url;
    }

    public void setHls_url(String hls_url) {
        this.hls_url = hls_url;
    }

    public String getIs_fn_hot() {
        return is_fn_hot;
    }

    public void setIs_fn_hot(String is_fn_hot) {
        this.is_fn_hot = is_fn_hot;
    }

    public boolean isIs_fn_multi_stream() {
        return is_fn_multi_stream;
    }

    public void setIs_fn_multi_stream(boolean is_fn_multi_stream) {
        this.is_fn_multi_stream = is_fn_multi_stream;
    }

    public String getIs_invalid_copyright() {
        return is_invalid_copyright;
    }

    public void setIs_invalid_copyright(String is_invalid_copyright) {
        this.is_invalid_copyright = is_invalid_copyright;
    }

    public String getIs_ipad_support() {
        return is_ipad_support;
    }

    public void setIs_ipad_support(String is_ipad_support) {
        this.is_ipad_support = is_ipad_support;
    }

    public boolean isIs_p2p_use() {
        return is_p2p_use;
    }

    public void setIs_p2p_use(boolean is_p2p_use) {
        this.is_p2p_use = is_p2p_use;
    }

    public String getIs_protected() {
        return is_protected;
    }

    public void setIs_protected(String is_protected) {
        this.is_protected = is_protected;
    }

    public LcBean getLc() {
        return lc;
    }

    public void setLc(LcBean lc) {
        this.lc = lc;
    }

    public String getPlay_channel() {
        return play_channel;
    }

    public void setPlay_channel(String play_channel) {
        this.play_channel = play_channel;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getProduce_id() {
        return produce_id;
    }

    public void setProduce_id(String produce_id) {
        this.produce_id = produce_id;
    }

    public String getPublicX() {
        return publicX;
    }

    public void setPublicX(String publicX) {
        this.publicX = publicX;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
    }

    public static class CdnInfoBean {
        /**
         * cdn_code : VOD-MP4-CDN-CNC
         * cdn_name : 3rd网宿
         * cdn_vip : vod.cntv.lxdns.com
         */

        private String cdn_code;
        private String cdn_name;
        private String cdn_vip;

        public String getCdn_code() {
            return cdn_code;
        }

        public void setCdn_code(String cdn_code) {
            this.cdn_code = cdn_code;
        }

        public String getCdn_name() {
            return cdn_name;
        }

        public void setCdn_name(String cdn_name) {
            this.cdn_name = cdn_name;
        }

        public String getCdn_vip() {
            return cdn_vip;
        }

        public void setCdn_vip(String cdn_vip) {
            this.cdn_vip = cdn_vip;
        }
    }

    public static class HlsCdnInfoBean {
        /**
         * cdn_code : VOD-HLS-CDN-CNC
         * cdn_name : 3rd网宿
         * cdn_vip : asp.cntv.lxdns.com
         */

        private String cdn_code;
        private String cdn_name;
        private String cdn_vip;

        public String getCdn_code() {
            return cdn_code;
        }

        public void setCdn_code(String cdn_code) {
            this.cdn_code = cdn_code;
        }

        public String getCdn_name() {
            return cdn_name;
        }

        public void setCdn_name(String cdn_name) {
            this.cdn_name = cdn_name;
        }

        public String getCdn_vip() {
            return cdn_vip;
        }

        public void setCdn_vip(String cdn_vip) {
            this.cdn_vip = cdn_vip;
        }
    }

    public static class LcBean {
        /**
         * city_code :
         * country_code : CN
         * ip : 115.171.30.186
         * isp_code : 1
         * provice_code : BJ
         */

        private String city_code;
        private String country_code;
        private String ip;
        private String isp_code;
        private String provice_code;

        public String getCity_code() {
            return city_code;
        }

        public void setCity_code(String city_code) {
            this.city_code = city_code;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getIsp_code() {
            return isp_code;
        }

        public void setIsp_code(String isp_code) {
            this.isp_code = isp_code;
        }

        public String getProvice_code() {
            return provice_code;
        }

        public void setProvice_code(String provice_code) {
            this.provice_code = provice_code;
        }
    }

    public static class VideoBean {
        /**
         * chapters : [{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264818000nero_aac32.mp4"}]
         * chapters2 : [{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h2641200000nero_aac128.mp4"}]
         * chapters3 : [{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h2642000000nero_aac128.mp4"}]
         * chapters4 : [{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264418000nero_aac32.mp4"}]
         * lowChapters : [{"duration":"91","image":"","url":"http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264200000nero_aac16.mp4"}]
         * totalLength : 91.00
         * url :
         * validChapterNum : 5
         */

        private String totalLength;
        private String url;
        private int validChapterNum;
        private List<ChaptersBean> chapters;
        private List<Chapters2Bean> chapters2;
        private List<Chapters3Bean> chapters3;
        private List<Chapters4Bean> chapters4;
        private List<LowChaptersBean> lowChapters;

        public String getTotalLength() {
            return totalLength;
        }

        public void setTotalLength(String totalLength) {
            this.totalLength = totalLength;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getValidChapterNum() {
            return validChapterNum;
        }

        public void setValidChapterNum(int validChapterNum) {
            this.validChapterNum = validChapterNum;
        }

        public List<ChaptersBean> getChapters() {
            return chapters;
        }

        public void setChapters(List<ChaptersBean> chapters) {
            this.chapters = chapters;
        }

        public List<Chapters2Bean> getChapters2() {
            return chapters2;
        }

        public void setChapters2(List<Chapters2Bean> chapters2) {
            this.chapters2 = chapters2;
        }

        public List<Chapters3Bean> getChapters3() {
            return chapters3;
        }

        public void setChapters3(List<Chapters3Bean> chapters3) {
            this.chapters3 = chapters3;
        }

        public List<Chapters4Bean> getChapters4() {
            return chapters4;
        }

        public void setChapters4(List<Chapters4Bean> chapters4) {
            this.chapters4 = chapters4;
        }

        public List<LowChaptersBean> getLowChapters() {
            return lowChapters;
        }

        public void setLowChapters(List<LowChaptersBean> lowChapters) {
            this.lowChapters = lowChapters;
        }

        public static class ChaptersBean {
            /**
             * duration : 91
             * image :
             * url : http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264818000nero_aac32.mp4
             */

            private String duration;
            private String image;
            private String url;

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class Chapters2Bean {
            /**
             * duration : 91
             * image :
             * url : http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h2641200000nero_aac128.mp4
             */

            private String duration;
            private String image;
            private String url;

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class Chapters3Bean {
            /**
             * duration : 91
             * image :
             * url : http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h2642000000nero_aac128.mp4
             */

            private String duration;
            private String image;
            private String url;

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class Chapters4Bean {
            /**
             * duration : 91
             * image :
             * url : http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264418000nero_aac32.mp4
             */

            private String duration;
            private String image;
            private String url;

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class LowChaptersBean {
            /**
             * duration : 91
             * image :
             * url : http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/293b177449d13de24e89ccd00a4e5c44_h264200000nero_aac16.mp4
             */

            private String duration;
            private String image;
            private String url;

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
