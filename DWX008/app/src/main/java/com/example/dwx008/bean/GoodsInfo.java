package com.example.dwx008.bean;

import com.example.dwx008.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "联想(Lenovo)天逸", "印花t恤半袖衫", "埖煦风衣男中长款", "AirPods Pro", "新款加绒男靴马丁靴", "贵州茅台酒","爱士堡小麦白啤酒","木韵美居 沙发","iPhone 11","木以成居 电脑桌"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "联想(Lenovo)天逸510S 十代英特尔酷睿i3 台式机电脑整机(i3-10100 8G 1T wifi win10 三年上门)21.5英寸",
            "南极人潮牌原宿风纯棉短袖男t恤宽松男装大码上衣ins港风情侣印花t恤半袖衫 白/小恐龙",
            "埖煦风衣男中长款2020秋冬新款加棉加厚毛呢大衣男士风衣男长款呢子大衣男呢子外套男冬季防风保暖大衣 ",
            "Apple AirPods Pro 主动降噪无线蓝牙耳机 适用iPhone/iPad/Apple Watch",
            "秋冬新款加绒男靴马丁靴男英伦高帮皮鞋真皮复古短靴潮流百搭中帮皮靴头层牛皮靴子潮",
            "飞天 53%vol 500ml 贵州茅台酒（带杯）",
            "爱士堡 （Eichbaum）小麦白啤酒500ml*24听整箱装 德国原装进口",
            "木韵美居 沙发 布艺沙发 北欧小户型三人位沙发 日式转角组合沙发 sh-912 湖水蓝 大三人位+脚踏",
            "Apple iPhone 11 (A2223) 128GB 黑色 移动联通电信4G手机 双卡双待",
            "木以成居 电脑桌书桌加宽台式家用现代简约简易办公桌写字桌子 苹果木色白色桌腿 LY-1049"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4999, 34999, 4999, 47999, 3518, 1179,1699,1999,249,108};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.dn_s, R.drawable.dx_s, R.drawable.dy_s,
            R.drawable.ej_s, R.drawable.mdx_s, R.drawable.mt_s,
            R.drawable.pj_s,R.drawable.sf_s,R.drawable.sj_s,R.drawable.zhuozi_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.dn, R.drawable.dx, R.drawable.dy,
            R.drawable.ej, R.drawable.mdx, R.drawable.mt,
            R.drawable.pj,R.drawable.sf,R.drawable.sj,R.drawable.zhuozi
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
