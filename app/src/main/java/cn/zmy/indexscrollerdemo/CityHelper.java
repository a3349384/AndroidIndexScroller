package cn.zmy.indexscrollerdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zmy on 2016/6/21 0021.
 */
public class CityHelper
{
    public static List<CityItem> getAllCities()
    {
        List<CityItem> list = new ArrayList<>();
        list.add(new CityItem(110000, "北京市", "Beijing"));
        list.add(new CityItem(120000, "天津市", "Tianjin"));
        list.add(new CityItem(310000, "上海市", "Shanghai"));
        list.add(new CityItem(500000, "重庆市", "Chongqing"));
        list.add(new CityItem(130100, "石家庄市", "Shijiazhuang"));
        list.add(new CityItem(130200, "唐山市", "Tangshan"));
        list.add(new CityItem(130300, "秦皇岛市", "Qinhuangdao"));
        list.add(new CityItem(130400, "邯郸市", "Handan"));
        list.add(new CityItem(130500, "邢台市", "Xingtai"));
        list.add(new CityItem(130600, "保定市", "Baoding"));
        list.add(new CityItem(130700, "张家口市", "Zhangjiakou"));
        list.add(new CityItem(130800, "承德市", "Chengde"));
        list.add(new CityItem(130900, "沧州市", "Cangzhou"));
        list.add(new CityItem(131000, "廊坊市", "Langfang"));
        list.add(new CityItem(131100, "衡水市", "Hengshui"));
        list.add(new CityItem(140100, "太原市", "Taiyuan"));
        list.add(new CityItem(140200, "大同市", "Datong"));
        list.add(new CityItem(140300, "阳泉市", "Yangquan"));
        list.add(new CityItem(140400, "长治市", "Changzhi"));
        list.add(new CityItem(140500, "晋城市", "Jincheng"));
        list.add(new CityItem(140600, "朔州市", "Shuozhou"));
        list.add(new CityItem(140700, "晋中市", "Jinzhong"));
        list.add(new CityItem(140800, "运城市", "Yuncheng"));
        list.add(new CityItem(140900, "忻州市", "Xinzhou"));
        list.add(new CityItem(141000, "临汾市", "Linfen"));
        list.add(new CityItem(141100, "吕梁市", "Lvliang"));
        list.add(new CityItem(150100, "呼和浩特市", "Huhehaote"));
        list.add(new CityItem(150200, "包头市", "Baotou"));
        list.add(new CityItem(150300, "乌海市", "Wuhai"));
        list.add(new CityItem(150400, "赤峰市", "Chifeng"));
        list.add(new CityItem(150500, "通辽市", "Tongliao"));
        list.add(new CityItem(150600, "鄂尔多斯市", "Eerduosi"));
        list.add(new CityItem(150700, "呼伦贝尔市", "Hulunbeier"));
        list.add(new CityItem(150800, "巴彦淖尔市", "Bayannaoer"));
        list.add(new CityItem(150900, "乌兰察布市", "Wulanchabu"));
        list.add(new CityItem(152200, "兴安盟", "Xinganmeng"));
        list.add(new CityItem(152500, "锡林郭勒盟", "Xilinguolemeng"));
        list.add(new CityItem(152900, "阿拉善盟", "Alashanmeng"));
        list.add(new CityItem(210100, "沈阳市", "Shenyang"));
        list.add(new CityItem(210200, "大连市", "Dalian"));
        list.add(new CityItem(210300, "鞍山市", "Anshan"));
        list.add(new CityItem(210400, "抚顺市", "Fushun"));
        list.add(new CityItem(210500, "本溪市", "Benxi"));
        list.add(new CityItem(210600, "丹东市", "Dandong"));
        list.add(new CityItem(210700, "锦州市", "Jinzhou"));
        list.add(new CityItem(210800, "营口市", "Yingkou"));
        list.add(new CityItem(210900, "阜新市", "Fuxin"));
        list.add(new CityItem(211000, "辽阳市", "Liaoyang"));
        list.add(new CityItem(211100, "盘锦市", "Panjin"));
        list.add(new CityItem(211200, "铁岭市", "Tieling"));
        list.add(new CityItem(211300, "朝阳市", "Chaoyang"));
        list.add(new CityItem(211400, "葫芦岛市", "Huludao"));
        list.add(new CityItem(220100, "长春市", "Changchun"));
        list.add(new CityItem(220200, "吉林市", "Jilin"));
        list.add(new CityItem(220300, "四平市", "Siping"));
        list.add(new CityItem(220400, "辽源市", "Liaoyuan"));
        list.add(new CityItem(220500, "通化市", "Tonghua"));
        list.add(new CityItem(220600, "白山市", "Baishan"));
        list.add(new CityItem(220700, "松原市", "Songyuan"));
        list.add(new CityItem(220800, "白城市", "Baicheng"));
        list.add(new CityItem(222400, "延边州", "Yanbian"));
        list.add(new CityItem(230100, "哈尔滨市", "Haerbin"));
        list.add(new CityItem(230200, "齐齐哈尔市", "Qiqihaer"));
        list.add(new CityItem(230300, "鸡西市", "Jixi"));
        list.add(new CityItem(230400, "鹤岗市", "Hegang"));
        list.add(new CityItem(230500, "双鸭山市", "Shuangyashan"));
        list.add(new CityItem(230600, "大庆市", "Daqing"));
        list.add(new CityItem(230700, "伊春市", "Yichun1"));
        list.add(new CityItem(230800, "佳木斯市", "Jiamusi"));
        list.add(new CityItem(230900, "七台河市", "Qitaihe"));
        list.add(new CityItem(231000, "牡丹江市", "Mudanjiang"));
        list.add(new CityItem(231100, "黑河市", "Heihe"));
        list.add(new CityItem(231200, "绥化市", "Suihua"));
        list.add(new CityItem(232700, "大兴安岭地区", "Daxinganling"));
        list.add(new CityItem(320100, "南京市", "Nanjing"));
        list.add(new CityItem(320200, "无锡市", "Wuxi"));
        list.add(new CityItem(320300, "徐州市", "Xuzhou"));
        list.add(new CityItem(320400, "常州市", "Changzhou"));
        list.add(new CityItem(320500, "苏州市", "Suzhou"));
        list.add(new CityItem(320600, "南通市", "Nantong"));
        list.add(new CityItem(320700, "连云港市", "Lianyungang"));
        list.add(new CityItem(320800, "淮安市", "Huaian"));
        list.add(new CityItem(320900, "盐城市", "Yancheng"));
        list.add(new CityItem(321000, "扬州市", "Yangzhou"));
        list.add(new CityItem(321100, "镇江市", "Zhenjiang"));
        list.add(new CityItem(321200, "泰州市", "Taizhou"));
        list.add(new CityItem(321300, "宿迁市", "Suqian"));
        list.add(new CityItem(330100, "杭州市", "Hangzhou"));
        list.add(new CityItem(330200, "宁波市", "Ningbo"));
        list.add(new CityItem(330300, "温州市", "Wenzhou"));
        list.add(new CityItem(330400, "嘉兴市", "Jiaxing"));
        list.add(new CityItem(330500, "湖州市", "Huzhou"));
        list.add(new CityItem(330600, "绍兴市", "Shaoxing"));
        list.add(new CityItem(330700, "金华市", "Jinhua"));
        list.add(new CityItem(330800, "衢州市", "Quzhou"));
        list.add(new CityItem(330900, "舟山市", "Zhoushan"));
        list.add(new CityItem(331000, "台州市", "Taizhou1"));
        list.add(new CityItem(331100, "丽水市", "Lishui"));
        list.add(new CityItem(340100, "合肥市", "Hefei"));
        list.add(new CityItem(340200, "芜湖市", "Wuhu"));
        list.add(new CityItem(340300, "蚌埠市", "Bengbu"));
        list.add(new CityItem(340400, "淮南市", "Huainan"));
        list.add(new CityItem(340500, "马鞍山市", "Maanshan"));
        list.add(new CityItem(340600, "淮北市", "Huaibei"));
        list.add(new CityItem(340700, "铜陵市", "Tongling"));
        list.add(new CityItem(340800, "安庆市", "Anqing"));
        list.add(new CityItem(341000, "黄山市", "Huangshan"));
        list.add(new CityItem(341100, "滁州市", "Chuzhou"));
        list.add(new CityItem(341200, "阜阳市", "Fuyang"));
        list.add(new CityItem(341300, "宿州市", "Suzhou1"));
        list.add(new CityItem(341500, "六安市", "Liuan"));
        list.add(new CityItem(341600, "亳州市", "Bozhou"));
        list.add(new CityItem(341700, "池州市", "Chizhou"));
        list.add(new CityItem(341800, "宣城市", "Xuancheng"));
        list.add(new CityItem(350100, "福州市", "Fuzhou"));
        list.add(new CityItem(350200, "厦门市", "Xiamen"));
        list.add(new CityItem(350300, "莆田市", "Putian"));
        list.add(new CityItem(350400, "三明市", "Sanming"));
        list.add(new CityItem(350500, "泉州市", "Quanzhou"));
        list.add(new CityItem(350600, "漳州市", "Zhangzhou"));
        list.add(new CityItem(350700, "南平市", "Nanping"));
        list.add(new CityItem(350800, "龙岩市", "Longyan"));
        list.add(new CityItem(350900, "宁德市", "Ningde"));
        list.add(new CityItem(360100, "南昌市", "Nanchang"));
        list.add(new CityItem(360200, "景德镇市", "Jingdezhen"));
        list.add(new CityItem(360300, "萍乡市", "Pingxiang"));
        list.add(new CityItem(360400, "九江市", "Jiujiang"));
        list.add(new CityItem(360500, "新余市", "Xinyu"));
        list.add(new CityItem(360600, "鹰潭市", "Yingtan"));
        list.add(new CityItem(360700, "赣州市", "Ganzhou"));
        list.add(new CityItem(360800, "吉安市", "Jian"));
        list.add(new CityItem(360900, "宜春市", "Yichun"));
        list.add(new CityItem(361000, "抚州市", "Fuzhou1"));
        list.add(new CityItem(361100, "上饶市", "Shangrao"));
        list.add(new CityItem(370100, "济南市", "Jinan"));
        list.add(new CityItem(370200, "青岛市", "Qingdao"));
        list.add(new CityItem(370300, "淄博市", "Zibo"));
        list.add(new CityItem(370400, "枣庄市", "Zaozhuang"));
        list.add(new CityItem(370500, "东营市", "Dongying"));
        list.add(new CityItem(370600, "烟台市", "Yantai"));
        list.add(new CityItem(370700, "潍坊市", "Weifang"));
        list.add(new CityItem(370800, "济宁市", "Jining"));
        list.add(new CityItem(370900, "泰安市", "Taian"));
        list.add(new CityItem(371000, "威海市", "Weihai"));
        list.add(new CityItem(371100, "日照市", "Rizhao"));
        list.add(new CityItem(371200, "莱芜市", "Laiwu"));
        list.add(new CityItem(371300, "临沂市", "Linyi"));
        list.add(new CityItem(371400, "德州市", "Dezhou"));
        list.add(new CityItem(371500, "聊城市", "Liaocheng"));
        list.add(new CityItem(371600, "滨州市", "Binzhou"));
        list.add(new CityItem(371700, "菏泽市", "Heze"));
        list.add(new CityItem(410100, "郑州市", "Zhengzhou"));
        list.add(new CityItem(410200, "开封市", "Kaifeng"));
        list.add(new CityItem(410300, "洛阳市", "Luoyang"));
        list.add(new CityItem(410400, "平顶山市", "Pingdingshan"));
        list.add(new CityItem(410500, "安阳市", "Anyang"));
        list.add(new CityItem(410600, "鹤壁市", "Hebi"));
        list.add(new CityItem(410700, "新乡市", "Xinxiang"));
        list.add(new CityItem(410800, "焦作市", "Jiaozuo"));
        list.add(new CityItem(410900, "濮阳市", "Puyang"));
        list.add(new CityItem(411000, "许昌市", "Xuchang"));
        list.add(new CityItem(411100, "漯河市", "Luohe"));
        list.add(new CityItem(411200, "三门峡市", "Sanmenxia"));
        list.add(new CityItem(411300, "南阳市", "Nanyang"));
        list.add(new CityItem(411400, "商丘市", "Shangqiu"));
        list.add(new CityItem(411500, "信阳市", "Xinyang"));
        list.add(new CityItem(411600, "周口市", "Zhoukou"));
        list.add(new CityItem(411700, "驻马店市", "Zhumadian"));
        list.add(new CityItem(420100, "武汉市", "Wuhan"));
        list.add(new CityItem(420200, "黄石市", "Huangshi"));
        list.add(new CityItem(420300, "十堰市", "Shiyan"));
        list.add(new CityItem(420500, "宜昌市", "Yichang"));
        list.add(new CityItem(420600, "襄阳市", "Xiangyang"));
        list.add(new CityItem(420700, "鄂州市", "Ezhou"));
        list.add(new CityItem(420800, "荆门市", "Jingmen"));
        list.add(new CityItem(420900, "孝感市", "Xiaogan"));
        list.add(new CityItem(421000, "荆州市", "Jingzhou"));
        list.add(new CityItem(421100, "黄冈市", "Huanggang"));
        list.add(new CityItem(421200, "咸宁市", "Xianning"));
        list.add(new CityItem(421300, "随州市", "Suizhou"));
        list.add(new CityItem(422800, "恩施州", "Enshi"));
        list.add(new CityItem(430100, "长沙市", "Changsha"));
        list.add(new CityItem(430200, "株洲市", "Zhuzhou"));
        list.add(new CityItem(430300, "湘潭市", "Xiangtan"));
        list.add(new CityItem(430400, "衡阳市", "Hengyang"));
        list.add(new CityItem(430500, "邵阳市", "Shaoyang"));
        list.add(new CityItem(430600, "岳阳市", "Yueyang"));
        list.add(new CityItem(430700, "常德市", "Changde"));
        list.add(new CityItem(430800, "张家界市", "Zhangjiajie"));
        list.add(new CityItem(430900, "益阳市", "Yiyang"));
        list.add(new CityItem(431000, "郴州市", "Chenzhou"));
        list.add(new CityItem(431100, "永州市", "Yongzhou"));
        list.add(new CityItem(431200, "怀化市", "Huaihua"));
        list.add(new CityItem(431300, "娄底市", "Loudi"));
        list.add(new CityItem(433100, "湘西州", "Xiangxi"));
        list.add(new CityItem(440100, "广州市", "Guangzhou"));
        list.add(new CityItem(440200, "韶关市", "Shaoguan"));
        list.add(new CityItem(440300, "深圳市", "Shenzhen"));
        list.add(new CityItem(440400, "珠海市", "Zhuhai"));
        list.add(new CityItem(440500, "汕头市", "Shantou"));
        list.add(new CityItem(440600, "佛山市", "Foshan"));
        list.add(new CityItem(440700, "江门市", "Jiangmen"));
        list.add(new CityItem(440800, "湛江市", "Zhanjiang"));
        list.add(new CityItem(440900, "茂名市", "Maoming"));
        list.add(new CityItem(441200, "肇庆市", "Zhaoqing"));
        list.add(new CityItem(441300, "惠州市", "Huizhou"));
        list.add(new CityItem(441400, "梅州市", "Meizhou"));
        list.add(new CityItem(441500, "汕尾市", "Shanwei"));
        list.add(new CityItem(441600, "河源市", "Heyuan"));
        list.add(new CityItem(441700, "阳江市", "Yangjiang"));
        list.add(new CityItem(441800, "清远市", "Qingyuan"));
        list.add(new CityItem(441900, "东莞市", "Dongguan"));
        list.add(new CityItem(442000, "中山市", "Zhongshan"));
        list.add(new CityItem(445100, "潮州市", "Chaozhou"));
        list.add(new CityItem(445200, "揭阳市", "Jieyang"));
        list.add(new CityItem(445300, "云浮市", "Yunfu"));
        list.add(new CityItem(450100, "南宁市", "Nanning"));
        list.add(new CityItem(450200, "柳州市", "Liuzhou"));
        list.add(new CityItem(450300, "桂林市", "Guilin"));
        list.add(new CityItem(450400, "梧州市", "Wuzhou"));
        list.add(new CityItem(450500, "北海市", "Beihai"));
        list.add(new CityItem(450600, "防城港市", "Fangchenggang"));
        list.add(new CityItem(450700, "钦州市", "Qinzhou"));
        list.add(new CityItem(450800, "贵港市", "Guigang"));
        list.add(new CityItem(450900, "玉林市", "Yulin"));
        list.add(new CityItem(451000, "百色市", "Baise"));
        list.add(new CityItem(451100, "贺州市", "Hezhou"));
        list.add(new CityItem(451200, "河池市", "Hechi"));
        list.add(new CityItem(451300, "来宾市", "Laibin"));
        list.add(new CityItem(451400, "崇左市", "Chongzuo"));
        list.add(new CityItem(460100, "海口市", "Haikou"));
        list.add(new CityItem(460200, "三亚市", "Sanya"));
        list.add(new CityItem(460300, "三沙市", "Sansha"));
        list.add(new CityItem(510100, "成都市", "Chengdu"));
        list.add(new CityItem(510300, "自贡市", "Zigong"));
        list.add(new CityItem(510400, "攀枝花市", "Panzhihua"));
        list.add(new CityItem(510500, "泸州市", "Luzhou"));
        list.add(new CityItem(510600, "德阳市", "Deyang"));
        list.add(new CityItem(510700, "绵阳市", "Mianyang"));
        list.add(new CityItem(510800, "广元市", "Guangyuan"));
        list.add(new CityItem(510900, "遂宁市", "Suining"));
        list.add(new CityItem(511000, "内江市", "Neijiang"));
        list.add(new CityItem(511100, "乐山市", "Leshan"));
        list.add(new CityItem(511300, "南充市", "Nanchong"));
        list.add(new CityItem(511400, "眉山市", "Meishan"));
        list.add(new CityItem(511500, "宜宾市", "Yibin"));
        list.add(new CityItem(511600, "广安市", "Guangan"));
        list.add(new CityItem(511700, "达州市", "Dazhou"));
        list.add(new CityItem(511800, "雅安市", "Yaan"));
        list.add(new CityItem(511900, "巴中市", "Bazhong"));
        list.add(new CityItem(512000, "资阳市", "Ziyang"));
        list.add(new CityItem(513200, "阿坝", "Aba"));
        list.add(new CityItem(513300, "甘孜", "Ganzi"));
        list.add(new CityItem(513400, "凉山", "Liangshan"));
        list.add(new CityItem(520100, "贵阳市", "Guiyang"));
        list.add(new CityItem(520200, "六盘水市", "Liupanshui"));
        list.add(new CityItem(520300, "遵义市", "Zunyi"));
        list.add(new CityItem(520400, "安顺市", "Anshun"));
        list.add(new CityItem(520500, "毕节市", "Bijie"));
        list.add(new CityItem(520600, "铜仁市", "Tongren"));
        list.add(new CityItem(522300, "黔西南州", "Qianxinan"));
        list.add(new CityItem(522600, "黔东南州", "Qiandongnan"));
        list.add(new CityItem(522700, "黔南州", "Qiannan"));
        list.add(new CityItem(530100, "昆明市", "Kunming"));
        list.add(new CityItem(530300, "曲靖市", "Qujing"));
        list.add(new CityItem(530400, "玉溪市", "Yuxi"));
        list.add(new CityItem(530500, "保山市", "Baoshan"));
        list.add(new CityItem(530600, "昭通市", "Zhaotong"));
        list.add(new CityItem(530700, "丽江市", "Lijiang"));
        list.add(new CityItem(530800, "普洱市", "Puer"));
        list.add(new CityItem(530900, "临沧市", "Lincang"));
        list.add(new CityItem(532300, "楚雄州", "Chuxiong"));
        list.add(new CityItem(532500, "红河州", "Honghe"));
        list.add(new CityItem(532600, "文山州", "Wenshan"));
        list.add(new CityItem(532800, "西双版纳州", "Xishuangbanna"));
        list.add(new CityItem(532900, "大理州", "Dali"));
        list.add(new CityItem(533100, "德宏州", "Dehong"));
        list.add(new CityItem(533300, "怒江州", "Nujiang"));
        list.add(new CityItem(533400, "迪庆州", "Diqing"));
        list.add(new CityItem(540100, "拉萨市", "Lasa"));
        list.add(new CityItem(542100, "昌都地区", "Changdu"));
        list.add(new CityItem(542200, "山南地区", "Shannan"));
        list.add(new CityItem(542300, "日喀则地区", "Rikaze"));
        list.add(new CityItem(542400, "那曲地区", "Naqu"));
        list.add(new CityItem(542500, "阿里地区", "Ali"));
        list.add(new CityItem(542600, "林芝地区", "Linzhi"));
        list.add(new CityItem(610100, "西安市", "Xian"));
        list.add(new CityItem(610200, "铜川市", "Tongchuan"));
        list.add(new CityItem(610300, "宝鸡市", "Baoji"));
        list.add(new CityItem(610400, "咸阳市", "Xianyang"));
        list.add(new CityItem(610500, "渭南市", "Weinan"));
        list.add(new CityItem(610600, "延安市", "Yanan"));
        list.add(new CityItem(610700, "汉中市", "Hanzhong"));
        list.add(new CityItem(610800, "榆林市", "Yulin1"));
        list.add(new CityItem(610900, "安康市", "Ankang"));
        list.add(new CityItem(611000, "商洛市", "Shangluo"));
        list.add(new CityItem(620100, "兰州市", "Lanzhou"));
        list.add(new CityItem(620200, "嘉峪关市", "Jiayuguan"));
        list.add(new CityItem(620300, "金昌市", "Jinchang"));
        list.add(new CityItem(620400, "白银市", "Baiyin"));
        list.add(new CityItem(620500, "天水市", "Tianshui"));
        list.add(new CityItem(620600, "武威市", "Wuwei"));
        list.add(new CityItem(620700, "张掖市", "Zhangye"));
        list.add(new CityItem(620800, "平凉市", "Pingliang"));
        list.add(new CityItem(620900, "酒泉市", "Jiuquan"));
        list.add(new CityItem(621000, "庆阳市", "Qingyang"));
        list.add(new CityItem(621100, "定西市", "Dingxi"));
        list.add(new CityItem(621200, "陇南市", "Longnan"));
        list.add(new CityItem(622900, "临夏州", "Linxia"));
        list.add(new CityItem(623000, "甘南州", "Gannan"));
        list.add(new CityItem(630100, "西宁市", "Xining"));
        list.add(new CityItem(632100, "海东地区", "Haidong"));
        list.add(new CityItem(632200, "海北州", "Haibei"));
        list.add(new CityItem(632300, "黄南州", "Huangnan"));
        list.add(new CityItem(632500, "海南州", "Hainan"));
        list.add(new CityItem(632600, "果洛州", "Guoluo"));
        list.add(new CityItem(632700, "玉树州", "Yushu"));
        list.add(new CityItem(632800, "海西州", "Haixi"));
        list.add(new CityItem(640100, "银川市", "Yinchuan"));
        list.add(new CityItem(640200, "石嘴山市", "Shizuishan"));
        list.add(new CityItem(640300, "吴忠市", "Wuzhong"));
        list.add(new CityItem(640400, "固原市", "Guyuan"));
        list.add(new CityItem(640500, "中卫市", "Zhongwei"));
        list.add(new CityItem(650100, "乌鲁木齐市", "Wulumuqi"));
        list.add(new CityItem(650200, "克拉玛依市", "Kelamayi"));
        list.add(new CityItem(652100, "吐鲁番地区", "Tulufan"));
        list.add(new CityItem(652200, "哈密地区", "Hami"));
        list.add(new CityItem(652300, "昌吉州", "Changji"));
        list.add(new CityItem(652700, "博尔塔拉州", "Boertala"));
        list.add(new CityItem(652800, "巴音郭楞州", "Bayinguoleng"));
        list.add(new CityItem(652900, "阿克苏地区", "Akesu"));
        list.add(new CityItem(653000, "克孜勒苏州", "Kezilesu"));
        list.add(new CityItem(653100, "喀什地区", "Kashi"));
        list.add(new CityItem(653200, "和田地区", "Hetian"));
        list.add(new CityItem(654000, "伊犁州", "Yili"));
        list.add(new CityItem(654200, "塔城地区", "Tacheng"));
        list.add(new CityItem(654300, "阿勒泰地区", "Ataile"));
        list.add(new CityItem(419001, "济源市", "Jiyuan"));
        list.add(new CityItem(429004, "仙桃市", "Xiantao"));
        list.add(new CityItem(429005, "潜江市", "Qianjiang"));
        list.add(new CityItem(429006, "天门市", "Tianmen"));
        list.add(new CityItem(429021, "神农架林区", "Shennongjia"));
        list.add(new CityItem(469001, "五指山市", "Wuzhishan"));
        list.add(new CityItem(469002, "琼海市", "Qionghai"));
        list.add(new CityItem(469003, "儋州市", "Danzhou"));
        list.add(new CityItem(469005, "文昌市", "Wenchang"));
        list.add(new CityItem(469006, "万宁市", "Wanning"));
        list.add(new CityItem(469007, "东方市", "Dongfang"));
        list.add(new CityItem(469021, "定安县", "Dingan"));
        list.add(new CityItem(469022, "屯昌县", "Tunchang"));
        list.add(new CityItem(469023, "澄迈县", "Chengmai"));
        list.add(new CityItem(469024, "临高县", "Lingao"));
        list.add(new CityItem(469025, "白沙县", "Baisha"));
        list.add(new CityItem(469026, "昌江县", "Changjiang"));
        list.add(new CityItem(469027, "乐东县", "Ledong"));
        list.add(new CityItem(469028, "陵水县", "Lingshui"));
        list.add(new CityItem(469029, "保亭县", "Baoting"));
        list.add(new CityItem(469030, "琼中县", "Qiongzhong"));
        list.add(new CityItem(659001, "石河子市", "Shihezi"));
        list.add(new CityItem(659002, "阿拉尔市", "Alaer"));
        list.add(new CityItem(659003, "图木舒克市", "Tumushuke"));
        list.add(new CityItem(659004, "五家渠市", "Wujiaqu"));

        Collections.sort(list, new Comparator<CityItem>()
        {
            @Override
            public int compare(CityItem lhs, CityItem rhs)
            {
                return lhs.getEnName().compareTo(rhs.getEnName());
            }
        });
        return list;
    }
}
