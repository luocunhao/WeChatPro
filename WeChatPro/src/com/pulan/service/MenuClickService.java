package com.pulan.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pulan.entity.Article;
import com.pulan.utils.MessageResponse;

/**
 * 
 * 创建人：herosky   
 * 创建时间：2015-3-30 下午5:13:57   
 * 描述：菜单点击事件，处理
 *
 */
public class MenuClickService {
	private static Logger logger = Logger.getLogger(MenuClickService.class);
	/**
	 * 
	 * 描述：@param eventKey
	 * 描述：@param fromUserName
	 * 描述：@param toUserName
	 * 描述：@return 接受用户点击事件，通过微信推送给用户消息，跳转页面，发送消息等
	 * 作者：herosky
	 */
	public static String getClickResponse(String eventKey, String fromUserName,
			String toUserName) {
		// TODO 判断evetKey事件处理
		List<Article> articlelist = new ArrayList<Article>();
		Article article = new Article();
		String responseMessage ="";
		if(eventKey.equals("V1000")){
			logger.info("V1000 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFiaqjCvbYiaRnXcdNfh4WhYR4bulMNiahhIUZz2cicSEcb33quh81RZBotg/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnCoeEZsOOo8VYsHk8NYJuSMN5HPLaVtxydcsXXzoUMCC5hWRknZkaNjqmW9LXbc%2BnmR8PfAU75wj0Ay%2BN8GfhEry8D6sxJnpWqd2F2Wa99Mfg%3D%3D&chksm=681b69055f6ce0137547d292d8749ec8f970a202c65dc3487e3038d3204276b308e8fd4d4eb5#rd");
			article.setDescription("人资大数据分析平台产品");
			article.setTitle("人资大数据分析平台产品");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1001")){
			logger.info("V1001 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFUsODfUyvA0pUM24EIF7PWN4W2U6vJn43UcYQjmrjrZdfuhiaDVzzArg/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnBdoTM9o2jgMWkSEEY%2FpZfXDR0Ki0ePfC1Dqs5Dj8NhwOyWSG%2B3LNG4vlDEgP8pdVf1eECtBC4ly8uYkoYfbCI84QGSMhSLM5S6WpikZdgXkg%3D%3D&chksm=681b69005f6ce016c6829699a9bd50e922f9c185bfe5f7a6f2628ad6f63c9092dba7efbc7e48#rd");
			article.setDescription("文本挖掘分析机器人");
			article.setTitle("文本挖掘分析机器人");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1002")){
			logger.info("V1002 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFjicNcFYGNiaqgyodiaE6fibSyJcic6yxHL0eyP1cpXiaLq5VmhtlZFd3cAPw/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnB2RtjDL%2BBXB%2B9GU1%2BN1DhTTlUxxxXGDtfGSHNsj0JDZ6A7gX%2BoqME7xOAmSX5m3Jb1eECtBC4ly8uYkoYfbCI8PoNql0qrbXxYJ9KtCox7UA%3D%3D&chksm=681b69025f6ce0143b5f1ed3ee57456ee226d45cac8d4e59459b9c691d7b9a396dd94d976450#rd");
			article.setDescription("程序化智能自动营销宝1、触点数据采集吸客宝；2、水晶球机器人；3、野狼追客箭");
			article.setTitle("程序化智能自动营销宝");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1003")){
			logger.info("V1003 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFIxNWPwZFOZLyibPZOWggzqPeXibpzf9dHGdiaGxoTlGB61yVc9sS8FsXw/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnBSKbXktyx1nO3KFg0HtK8hwkIc%2BT4qw1EJ3r5VDiHJjJeQPE2lUomE314gofCjI%2Fn1eECtBC4ly8uYkoYfbCI8UalUqmoV7NRZsxGlnHUWZA%3D%3D&chksm=681b693c5f6ce02a423fd4bba8fef671f707ad794392f2d2c76f848dc1c7152f54fd91a78e22#rd");
			article.setDescription("数据采集产品1、PC行为数据采集；2、WEB、APP、微信、微博数据爬虫；3、WEB、APP、微信行为数据采集");
			article.setTitle("数据采集产品");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1004")){
			logger.info("V1004 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFQfGibNEfGwe9ibAmpPmaxyc4KzBPKLkUG2lw4oVuQGibs3XiacVtThXDicg/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDE8nOp%2BBMCGKtBJdmlUQpWRqm2APuA99b0Dl4iNUk%2B6GmVP89tlUrQX7aS3afiG0D1eECtBC4ly8uYkoYfbCI8tsg21jN8DwR9CvmsN65iZA%3D%3D&chksm=681b69365f6ce02019c1483313c338f0dab4fa636e15a2994d7b46cef37c4a64498e1d8c7572#rd");
			article.setDescription("水晶球机器学习分析引擎平台 1、数据统一视图模块2、特征值提取机器人模块3、标签画像模块4、机器学习算法模块5、微服务接口模块6、可视化展现分析模块");
			article.setTitle("水晶球机器学习分析引擎平台");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1005")){
			logger.info("V1005 IS TRUE");
			String respContent = "中国移动,中国联通,中国电信,中国国电";
			responseMessage = MessageResponse.getTextMessage(fromUserName, toUserName, respContent);
		}else if(eventKey.equals("V1006")){
			logger.info("V1006 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFXr0kbvbq7yD2BbXXEZugFcvDmyYgqJ19uunqnia2LYKWoiccph8qC2OQ/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDpM5kcFSqpEP5KrMl0qk6G6O5K%2FJ5iCiPFzKxPNqlj0wjXVPx3aRvyx8I7mcSrwlz1eECtBC4ly8uYkoYfbCI8Yjnn0ZOGFECXBM8BSJO9hA%3D%3D&chksm=681b69095f6ce01f2104296a6701d468eaecd4e92295e64baf32b0a10749e78e6c5956235aeb#rd");
			article.setDescription("美的集团、沃尔玛、广本汽车、快尚服饰、中国烟草");
			article.setTitle("企业在大数据中的案例");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1007")){
			logger.info("V1007 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFqODADpnsyOcMrldwk35VEeTOqvnSzthCibPYIIxTwBPgrUeBYhjXic1w/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnA3T%2B97j6XS3kfaRxtJvdKSmgm0w9w41M49lyI%2FLNWA1%2Fzpk4T336Nnxpw3MyEgHTb1eECtBC4ly8uYkoYfbCI8F%2F7KjBrW94aEkQwUJGo8mg%3D%3D&chksm=681b69105f6ce006bb2d4bed2ffc4d5bedc2f597b0ef59082fc530bb1aa2d948be191e1d0de9#rd");
			article.setDescription("坪山区政府、珠海市政府、河南环保局、上海证券交易所、中国福利彩票");
			article.setTitle("政府在大数据中的案例");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1008")){
			logger.info("V1008 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96SliasRaiaWwlp4764gibgJae97z9n93GLOic6Q40z82Rp6EMCBrZibrvD4wIEyw4FJ8ptbcMMwuGliab2w/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDU%2F9uBKDVsrO%2Ba4KYj8yNvGuar9OmUOszqngkFsq5berkfQQ0GBa5AgLlFuw6Bw4H1eECtBC4ly8uYkoYfbCI8f38%2FEi2fgtS7117ay6s%2B8w%3D%3D&chksm=681b69495f6ce05f2daf98ef410ae106b03e2f25b0716756a11e7919441b26008b2d476835ec#rd");
			article.setDescription("运营商金融大数据案例1、客户行为分析---标签画像精准关怀招揽精准营销2、客户流量群体分析---消费者洞察广告投放获客吸粉3、证券交易所基于Spark舆情监控分析---危机预警防范控制...");
			article.setTitle("运营商金融大数据解决方案");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1009")){
			logger.info("V1009 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96SliasRaiaWwlp4764gibgJae9iaudSNibzMQUXwC30b6cykiaosL7D1jTusOaWER5ZicXTxDuU49JGAegLw/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnAAMKiQXZs8Jy%2BsuKunJqxXPokGF1SqWCI23c4mrZ2BS2AcMQ0nGsWEYqbpjpsV06v1eECtBC4ly8uYkoYfbCI8pTczKNA6almobJ3fuZ1%2B1w%3D%3D&chksm=681b69565f6ce04009d61f76199b78e669434c4837d261ac60d950d428f36b7cc04d7dbf8bfd#rd");
			article.setDescription("政府公共事业大数据方案：1、大数据监控分析平台 2、博客微信网站采集监控与分析推荐系统 3、人流车流热力图及人群结构和标签...");
			article.setTitle("政府公共事业大数据解决方案");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1010")){
			logger.info("V1010 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFqODADpnsyOcMrldwk35VEeTOqvnSzthCibPYIIxTwBPgrUeBYhjXic1w/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnA3T%2B97j6XS3kfaRxtJvdKSmgm0w9w41M49lyI%2FLNWA1%2Fzpk4T336Nnxpw3MyEgHTaR8PfAU75wj0Ay%2BN8GfhEr2vm9mVIHZeVHdJ%2BFxXpgwQ%3D%3D&chksm=681b69105f6ce006bb2d4bed2ffc4d5bedc2f597b0ef59082fc530bb1aa2d948be191e1d0de9#rd");
			article.setDescription("企业大数据案例 1、企业触网数据采集与程序化追踪营销 2、全网消费者数据收集与统一视图 3、基于Hadoop数仓DW/BI及会员客户关怀招揽...");
			article.setTitle("企业大数据方案");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName, articlelist);
		}else{
			
			String respContent = "输入错误";
			responseMessage = MessageResponse.getTextMessage(fromUserName, toUserName, respContent);
		}
		return responseMessage;
	}
	

}
