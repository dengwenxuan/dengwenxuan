package com.example.dwx300.bean;

import com.example.dwx300.R;

import java.util.ArrayList;

public class GoodsInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }
    public GoodsInfo(){
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }
    private static String[] mNameArray = {
            "余文乐潮牌上衣", "布鲁森", "宾绸卫衣男", "元森博优加绒卫衣", "港风加绒加厚上衣", "笺罗 卫衣","南极人卫衣","潮牌卫衣男"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "已末天成连帽加绒卫衣男秋装bf风百搭余文乐潮牌上衣ins港风宽松套头长袖外套男 CHINA",
            "布鲁森 加绒加厚卫衣男连帽ins港风宽松潮流套头衫青年休闲内搭外穿打底衫学生时尚帅气百搭外套 ",
            "宾绸卫衣男潮连帽加绒加厚秋冬款韩版潮流宽松港风ins外套慵懒风秋季2020新款 ",
            "元森博优加绒卫衣男秋冬款无帽圆领加厚内搭潮青少年男生ins大码宽松外套",
            "Matri Mr秋冬款卫衣男韩版潮流宽松bf慵懒风连帽外套学生港风加绒加厚上衣 ",
            "笺罗 卫衣男加绒连帽秋冬加厚潮牌ins港风套头2020新款韩版学生休闲运动百搭印花潮流情侣长袖外套男 ",
            "南极人卫衣男连帽秋冬季新款加绒卫衣套装男韩版潮流工装外套男士长袖T恤男休闲运动套装男",
            "元森博优2020潮牌卫衣男动物园印花圆领大码长袖宽松男士上衣"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {299, 799, 499, 799, 199, 399,999,499};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a001_s, R.drawable.a002_s, R.drawable.a003_s,
            R.drawable.a004_s, R.drawable.a005_s, R.drawable.a006_s,
            R.drawable.a007_s, R.drawable.a008_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a001, R.drawable.a002, R.drawable.a003,
            R.drawable.a004, R.drawable.a005, R.drawable.a006,
            R.drawable.a007, R.drawable.a008
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

    private static int[] listImageArray = {R.drawable.public_01, R.drawable.public_02
            , R.drawable.public_03, R.drawable.public_04, R.drawable.public_05};
    private static String[] listTitleArray = {
            "首都日报", "海峡时报", "北方周末", "参照消息", "挨踢杂志"};
    private static String[] listDescArray = {
            "金秋时节香山染红，市民纷纷登山赏叶",
            "台风接踵而来，出门小心暴雨",
            "俄罗斯老人在东北，生活滋润乐不思蜀",
            "蒙内铁路建成通车，中国标准再下一城",
            "米6大战Mate10，千元智能机谁领风骚"};



    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }

    private static int[] stagImageArray = {R.drawable.iphone1, R.drawable.iphone2, R.drawable.iphone3
            , R.drawable.iphone4, R.drawable.iphone5, R.drawable.iphone6, R.drawable.iphone7
            , R.drawable.iphone8, R.drawable.iphone9, R.drawable.iphone10, R.drawable.iphone11
            , R.drawable.iphone12, R.drawable.iphone13, R.drawable.iphone14, R.drawable.iphone15
            , R.drawable.iphone16, R.drawable.iphone17, R.drawable.iphone18, R.drawable.iphone19
            , R.drawable.iphone20, R.drawable.iphone21, R.drawable.iphone22, R.drawable.iphone23};
    private static String[] stagTitleArray = {"卫衣一", "卫衣二", "卫衣三", "卫衣四", "卫衣五", "卫衣六",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "劲爆价格", "快来买",
            "全场减价", "大促销啦", "剁手吧", "卫衣跳楼价", "卫衣大卖", "该款五折", "卫衣半价", "买买买", "配件全套"};

    public static ArrayList<GoodsInfo> getDefaultStag() {
        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }

    private static int[] combineImageArray = {R.drawable.cainixihuan, R.drawable.dapaijiadao
            , R.drawable.trip_01, R.drawable.trip_02, R.drawable.trip_03, R.drawable.trip_04};
    private static String[] combineTitleArray = {
            "猜你喜欢", "大牌驾到", "买哪个", "别想了", "先下单", "包你满意"};

    public static ArrayList<GoodsInfo> getDefaultCombine() {
        ArrayList<GoodsInfo> combineArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < combineImageArray.length; i++) {
            combineArray.add(new GoodsInfo(combineImageArray[i], combineTitleArray[i], null));
        }
        return combineArray;
    }

    private static int[] appiImageArray = {R.drawable.dian01, R.drawable.dian02, R.drawable.dian03
            , R.drawable.dian04, R.drawable.dian05, R.drawable.dian06, R.drawable.dian07
            , R.drawable.dian08, R.drawable.dian09, R.drawable.dian10, R.drawable.dian11
            , R.drawable.dian12, R.drawable.dian13, R.drawable.dian14, R.drawable.dian15};
    private static String[] appiTitleArray = {"双十一", "大聚惠", "爆款价",
            "就一次", "手慢无", "快点击", "付定金", "享特权", "包安装", "再返券",
            "白送你", "想得美", "干活去", "好好学", "才有钱"};

    public static ArrayList<GoodsInfo> getDefaultAppi() {
        ArrayList<GoodsInfo> appiArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < appiImageArray.length; i++) {
            appiArray.add(new GoodsInfo(appiImageArray[i], appiTitleArray[i], null));
        }
        return appiArray;
    }

}
