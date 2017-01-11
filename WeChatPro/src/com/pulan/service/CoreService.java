package com.pulan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pulan.entity.Article;
import com.pulan.entity.Message;
import com.pulan.utils.MessageResponse;
import com.pulan.utils.MessageUtil;
import com.pulan.utils.TulingApiProcess;

public class CoreService {

	
	static Logger logger = LoggerFactory.getLogger(CoreService.class);
	

	/**
	 * 处理微信发来的请求
	 * 
	 * @param request
	 * @return
	 */
	public static String processRequest(Message message) {
		String respMessage = null;
		List<Article> articlelist = new ArrayList<Article>();
		Article article = new Article();
		try {
			// 默认返回的文本消息内容
			String respContent = "请求处理异常，请稍候尝试！";


			// 从HashMap中取出消息中的字段；
			// 发送方帐号（open_id）
			String fromUserName = message.getFromUserName();
			// 公众帐号
			String toUserName = message.getToUserName();
			// 消息类型
			String msgType = message.getMsgType();
			// 消息内容
			String content = message.getContent();
			// 从HashMap中取出消息中的字段；
			
			
			// 文本消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				//微信聊天机器人测试 2015-3-31
				if(content!=null){
					if("1".equals(content)){
						logger.info("1 IS TRUE");
						String respStr = "暂无消息";
						return MessageResponse.getTextMessage(fromUserName, toUserName, respStr);
					}else if("2".equals(content)){
						logger.info("2 IS TRUE");
						String respStr = "暂无消息";
						return MessageResponse.getTextMessage(fromUserName, toUserName, respStr);
					}else if("3".equals(content)){
						logger.info("3 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFfyGWH2tYF9PsEFkM2ziacuSn2h1Lewzk0YbqbIAxOpdfzvY9N70jEGg/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnB2RtjDL%2BBXB%2B9GU1%2BN1DhTTlUxxxXGDtfGSHNsj0JDZ6A7gX%2BoqME7xOAmSX5m3Jb1eECtBC4ly8uYkoYfbCI8PoNql0qrbXxYJ9KtCox7UA%3D%3D&chksm=681b69025f6ce0143b5f1ed3ee57456ee226d45cac8d4e59459b9c691d7b9a396dd94d976450#rd");
						article.setDescription("程序化智能自动营销宝1、触点数据采集吸客宝；2、水晶球机器人；3、野狼追客箭");
						article.setTitle("程序化自动追踪营销宝");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if("4".equals(content)){
						logger.info("4 IS TRUE");
						String respStr = "暂无消息";
						return MessageResponse.getTextMessage(fromUserName, toUserName, respStr);
					}else if("5".equals(content)){
						logger.info("5 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96RsRAA2Ka8f5vnqpKAfG7X9wngcyhhnb1pBfnMclPddgAo9Yh2h5HY94gEHDNxw2d9bwFoUhBWeibg/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDE8nOp%2BBMCGKtBJdmlUQpWRqm2APuA99b0Dl4iNUk%2B6GmVP89tlUrQX7aS3afiG0D1eECtBC4ly8uYkoYfbCI8tsg21jN8DwR9CvmsN65iZA%3D%3D&chksm=681b69365f6ce02019c1483313c338f0dab4fa636e15a2994d7b46cef37c4a64498e1d8c7572#rd");
						article.setDescription("水晶球机器学习分析引擎平台 1、数据统一视图模块2、特征值提取机器人模块3、标签画像模块4、机器学习算法模块5、微服务接口模块6、可视化展现分析模块");
						article.setTitle("水晶球机器学习分析引擎平台");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if("6".equals(content)){
						logger.info("6 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96RsRAA2Ka8f5vnqpKAfG7X9KhLtxaibtx67EjsPeBib8iaK2g960b4F5NU1GSaT8OBzNLgjes9Uhpsfw/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnBSKbXktyx1nO3KFg0HtK8hwkIc%2BT4qw1EJ3r5VDiHJjJeQPE2lUomE314gofCjI%2Fn1eECtBC4ly8uYkoYfbCI8UalUqmoV7NRZsxGlnHUWZA%3D%3D&chksm=681b693c5f6ce02a423fd4bba8fef671f707ad794392f2d2c76f848dc1c7152f54fd91a78e22#rd");
						article.setDescription("数据采集产品1、PC行为数据采集；2、WEB、APP、微信、微博数据爬虫；3、WEB、APP、微信行为数据采集");
						article.setTitle("数据采集产品");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if("7".equals(content)){
						logger.info("7 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96RsRAA2Ka8f5vnqpKAfG7X9YWoHUOB36JQtiaV6hSYntRHJJhyhjdV2H40vvnUPZ4Jlf0pIxfGg3WQ/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnBdoTM9o2jgMWkSEEY%2FpZfXDR0Ki0ePfC1Dqs5Dj8NhwOyWSG%2B3LNG4vlDEgP8pdVf1eECtBC4ly8uYkoYfbCI84QGSMhSLM5S6WpikZdgXkg%3D%3D&chksm=681b69005f6ce016c6829699a9bd50e922f9c185bfe5f7a6f2628ad6f63c9092dba7efbc7e48#rd");
						article.setDescription("文本挖掘分析机器人");
						article.setTitle("文本挖掘分析机器人");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if("8".equals(content)){
						logger.info("8 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96QNeubDVoU51Hro2W6sBRxF7ugqxpdsLAiaWYb1OeXcgPyqySiax66qtibHWJB9f6dH3UqiaPehdDuRWw/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnCoeEZsOOo8VYsHk8NYJuSMN5HPLaVtxydcsXXzoUMCC5hWRknZkaNjqmW9LXbc%2BnmR8PfAU75wj0Ay%2BN8GfhEry8D6sxJnpWqd2F2Wa99Mfg%3D%3D&chksm=681b69055f6ce0137547d292d8749ec8f970a202c65dc3487e3038d3204276b308e8fd4d4eb5#rd");
						article.setDescription("人资大数据分析平台产品");
						article.setTitle("人资大数据分析平台产品");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if("9".equals(content)){
						logger.info("9 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96SliasRaiaWwlp4764gibgJae9TP13ZP4jWGQEqITvl6UyTlpSB2LwZhDdEWqA9JVl5rCHBGMlMdH5Qg/0?wx_fmt=jpeg");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDU%2F9uBKDVsrO%2Ba4KYj8yNvGuar9OmUOszqngkFsq5berkfQQ0GBa5AgLlFuw6Bw4H1eECtBC4ly8uYkoYfbCI8f38%2FEi2fgtS7117ay6s%2B8w%3D%3D&chksm=681b69495f6ce05f2daf98ef410ae106b03e2f25b0716756a11e7919441b26008b2d476835ec#rd");
						article.setDescription("运营商金融大数据案例1、客户行为分析---标签画像精准关怀招揽精准营销2、客户流量群体分析---消费者洞察广告投放获客吸粉3、证券交易所基于Spark舆情监控分析---危机预警防范控制...");
						article.setTitle("运营商金融大数据解决方案");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if("10".equals(content)){
						logger.info("10 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFTyy6hic8ZzvEFic6TtHiaMkjlFUy4CGOicfUukUQ3fFGI0YnmDvhhEMCqg/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnA3T%2B97j6XS3kfaRxtJvdKSmgm0w9w41M49lyI%2FLNWA1%2Fzpk4T336Nnxpw3MyEgHTaR8PfAU75wj0Ay%2BN8GfhEr2vm9mVIHZeVHdJ%2BFxXpgwQ%3D%3D&chksm=681b69105f6ce006bb2d4bed2ffc4d5bedc2f597b0ef59082fc530bb1aa2d948be191e1d0de9#rd");
						article.setDescription("企业大数据案例 1、企业触网数据采集与程序化追踪营销 2、全网消费者数据收集与统一视图 3、基于Hadoop数仓DW/BI及会员客户关怀招揽...");
						article.setTitle("企业大数据解决方案");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName, articlelist);
					}else if("11".equals(content)){
						logger.info("11 IS TRUE");
						article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_png/pFQSMLRX96SliasRaiaWwlp4764gibgJae9OC4UKs8gCLSmt4GU69uSSY0TnGNkoeBZofgClastscAYW6O4l6xSAA/0?wx_fmt=png");
						article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnAAMKiQXZs8Jy%2BsuKunJqxXPokGF1SqWCI23c4mrZ2BS2AcMQ0nGsWEYqbpjpsV06v1eECtBC4ly8uYkoYfbCI8pTczKNA6almobJ3fuZ1%2B1w%3D%3D&chksm=681b69565f6ce04009d61f76199b78e669434c4837d261ac60d950d428f36b7cc04d7dbf8bfd#rd");
						article.setDescription("政府公共事业大数据方案：1、大数据监控分析平台 2、博客微信网站采集监控与分析推荐系统 3、人流车流热力图及人群结构和标签...");
						article.setTitle("政府公共事业大数据解决方案");
						articlelist.add(article);
						return MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
					}else if(content.contains("地址")||content.contains("位置")){
						return MessageResponse.getTextMessage(fromUserName , toUserName , "我们公司位于深圳市南山区高新园三道泰邦科技大厦10A");
					}else{
					respContent = TulingApiProcess.getTulingResult(content);
					logger.info("respContent:"+respContent);
					if(respContent==""||null==respContent){
					return	MessageResponse.getTextMessage(fromUserName , toUserName , "服务号暂时无法回复，请稍后再试！");
					}
					//return FormatXmlProcess.formatXmlAnswer(toUserName, fromUserName, respContent);
					return MessageResponse.getTextMessage(fromUserName , toUserName , respContent);
				}}
//				else if (content.startsWith("ZY")) {//鏌ヤ綔锟�?
//					String keyWord = content.replaceAll("^ZY" , "").trim();
//					if ("".equals(keyWord)) {
//						respContent = AutoReply.getXxtUsage("24");
//					} else {
//						return XxtService.getHomework("24" , fromUserName , toUserName , keyWord);
//					}
//				} else if (content.startsWith("SJX")) {//鏀朵欢锟�?
//					String keyWord = content.replaceAll("^SJX" , "").trim();
//					if ("".equals(keyWord)) {
//						respContent = AutoReply.getXxtUsage("25");
//					} else {
//						return XxtService.getRecvBox("25" , fromUserName , toUserName , keyWord);
//					}
//				}
//				return MessageResponse.getTextMessage(fromUserName , toUserName , respContent);
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {//  事件推送
				String eventType = message.getContent();// 事件类型
				
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {// 订阅
					article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFqODADpnsyOcMrldwk35VEeTOqvnSzthCibPYIIxTwBPgrUeBYhjXic1w/0?wx_fmt=jpeg");
					article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnA3T%2B97j6XS3kfaRxtJvdKSmgm0w9w41M49lyI%2FLNWA1%2Fzpk4T336Nnxpw3MyEgHTaR8PfAU75wj0Ay%2BN8GfhEr2vm9mVIHZeVHdJ%2BFxXpgwQ%3D%3D&chksm=681b69105f6ce006bb2d4bed2ffc4d5bedc2f597b0ef59082fc530bb1aa2d948be191e1d0de9#rd");
					article.setDescription("企业大数据解决方案");
					article.setTitle("企业大数据案例 1、企业触网数据采集与程序化追踪营销 2、全网消费者数据收集与统一视图 3、基于Hadoop数仓DW/BI及会员客户关怀招揽...");
					articlelist.add(article);
					return MessageResponse.getNewsMessage(fromUserName, toUserName, articlelist);
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {// 取消订阅
					// TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {//  自定义菜单点击事件
					String eventKey = message.getMsgId();// 事件KEY值，与创建自定义菜单时指定的KEY值对应
					logger.info("eventKey is:" +eventKey);
					return MenuClickService.getClickResponse(eventKey , fromUserName , toUserName);
				}
			}
			
			
			
			
			
			//开启微信声音识别测试 2015-3-30
			else if(msgType.equals("voice"))
			{
				String recvMessage = message.getContent();
				//respContent = "收到的语音解析结果："+recvMessage;
				if(recvMessage!=null){
					respContent = TulingApiProcess.getTulingResult(recvMessage);
				}else{
					respContent = "您说的太模糊了，能不能重新说下呢？";
				}
				return MessageResponse.getTextMessage(fromUserName , toUserName , respContent); 
			}
			//拍照功能
			else if(msgType.equals("pic_sysphoto"))
			{
				
			}
			else
			{
				return MessageResponse.getTextMessage(fromUserName , toUserName , "返回为空"); 
			}
			
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return respMessage;
	}

}
