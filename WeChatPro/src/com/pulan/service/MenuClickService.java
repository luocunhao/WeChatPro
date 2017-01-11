package com.pulan.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pulan.entity.Article;
import com.pulan.utils.MessageResponse;

/**
 * 
 * �����ˣ�herosky   
 * ����ʱ�䣺2015-3-30 ����5:13:57   
 * �������˵�����¼�������
 *
 */
public class MenuClickService {
	private static Logger logger = Logger.getLogger(MenuClickService.class);
	/**
	 * 
	 * ������@param eventKey
	 * ������@param fromUserName
	 * ������@param toUserName
	 * ������@return �����û�����¼���ͨ��΢�����͸��û���Ϣ����תҳ�棬������Ϣ��
	 * ���ߣ�herosky
	 */
	public static String getClickResponse(String eventKey, String fromUserName,
			String toUserName) {
		// TODO �ж�evetKey�¼�����
		List<Article> articlelist = new ArrayList<Article>();
		Article article = new Article();
		String responseMessage ="";
		if(eventKey.equals("V1000")){
			logger.info("V1000 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFiaqjCvbYiaRnXcdNfh4WhYR4bulMNiahhIUZz2cicSEcb33quh81RZBotg/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnCoeEZsOOo8VYsHk8NYJuSMN5HPLaVtxydcsXXzoUMCC5hWRknZkaNjqmW9LXbc%2BnmR8PfAU75wj0Ay%2BN8GfhEry8D6sxJnpWqd2F2Wa99Mfg%3D%3D&chksm=681b69055f6ce0137547d292d8749ec8f970a202c65dc3487e3038d3204276b308e8fd4d4eb5#rd");
			article.setDescription("���ʴ����ݷ���ƽ̨��Ʒ");
			article.setTitle("���ʴ����ݷ���ƽ̨��Ʒ");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1001")){
			logger.info("V1001 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFUsODfUyvA0pUM24EIF7PWN4W2U6vJn43UcYQjmrjrZdfuhiaDVzzArg/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnBdoTM9o2jgMWkSEEY%2FpZfXDR0Ki0ePfC1Dqs5Dj8NhwOyWSG%2B3LNG4vlDEgP8pdVf1eECtBC4ly8uYkoYfbCI84QGSMhSLM5S6WpikZdgXkg%3D%3D&chksm=681b69005f6ce016c6829699a9bd50e922f9c185bfe5f7a6f2628ad6f63c9092dba7efbc7e48#rd");
			article.setDescription("�ı��ھ����������");
			article.setTitle("�ı��ھ����������");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1002")){
			logger.info("V1002 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFjicNcFYGNiaqgyodiaE6fibSyJcic6yxHL0eyP1cpXiaLq5VmhtlZFd3cAPw/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnB2RtjDL%2BBXB%2B9GU1%2BN1DhTTlUxxxXGDtfGSHNsj0JDZ6A7gX%2BoqME7xOAmSX5m3Jb1eECtBC4ly8uYkoYfbCI8PoNql0qrbXxYJ9KtCox7UA%3D%3D&chksm=681b69025f6ce0143b5f1ed3ee57456ee226d45cac8d4e59459b9c691d7b9a396dd94d976450#rd");
			article.setDescription("���������Զ�Ӫ����1���������ݲɼ����ͱ���2��ˮ��������ˣ�3��Ұ��׷�ͼ�");
			article.setTitle("���������Զ�Ӫ����");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1003")){
			logger.info("V1003 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFIxNWPwZFOZLyibPZOWggzqPeXibpzf9dHGdiaGxoTlGB61yVc9sS8FsXw/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnBSKbXktyx1nO3KFg0HtK8hwkIc%2BT4qw1EJ3r5VDiHJjJeQPE2lUomE314gofCjI%2Fn1eECtBC4ly8uYkoYfbCI8UalUqmoV7NRZsxGlnHUWZA%3D%3D&chksm=681b693c5f6ce02a423fd4bba8fef671f707ad794392f2d2c76f848dc1c7152f54fd91a78e22#rd");
			article.setDescription("���ݲɼ���Ʒ1��PC��Ϊ���ݲɼ���2��WEB��APP��΢�š�΢���������棻3��WEB��APP��΢����Ϊ���ݲɼ�");
			article.setTitle("���ݲɼ���Ʒ");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1004")){
			logger.info("V1004 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFQfGibNEfGwe9ibAmpPmaxyc4KzBPKLkUG2lw4oVuQGibs3XiacVtThXDicg/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDE8nOp%2BBMCGKtBJdmlUQpWRqm2APuA99b0Dl4iNUk%2B6GmVP89tlUrQX7aS3afiG0D1eECtBC4ly8uYkoYfbCI8tsg21jN8DwR9CvmsN65iZA%3D%3D&chksm=681b69365f6ce02019c1483313c338f0dab4fa636e15a2994d7b46cef37c4a64498e1d8c7572#rd");
			article.setDescription("ˮ�������ѧϰ��������ƽ̨ 1������ͳһ��ͼģ��2������ֵ��ȡ������ģ��3����ǩ����ģ��4������ѧϰ�㷨ģ��5��΢����ӿ�ģ��6�����ӻ�չ�ַ���ģ��");
			article.setTitle("ˮ�������ѧϰ��������ƽ̨");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1005")){
			logger.info("V1005 IS TRUE");
			String respContent = "�й��ƶ�,�й���ͨ,�й�����,�й�����";
			responseMessage = MessageResponse.getTextMessage(fromUserName, toUserName, respContent);
		}else if(eventKey.equals("V1006")){
			logger.info("V1006 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFXr0kbvbq7yD2BbXXEZugFcvDmyYgqJ19uunqnia2LYKWoiccph8qC2OQ/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDpM5kcFSqpEP5KrMl0qk6G6O5K%2FJ5iCiPFzKxPNqlj0wjXVPx3aRvyx8I7mcSrwlz1eECtBC4ly8uYkoYfbCI8Yjnn0ZOGFECXBM8BSJO9hA%3D%3D&chksm=681b69095f6ce01f2104296a6701d468eaecd4e92295e64baf32b0a10749e78e6c5956235aeb#rd");
			article.setDescription("���ļ��š��ֶ��ꡢ�㱾���������з��Ρ��й��̲�");
			article.setTitle("��ҵ�ڴ������еİ���");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1007")){
			logger.info("V1007 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFqODADpnsyOcMrldwk35VEeTOqvnSzthCibPYIIxTwBPgrUeBYhjXic1w/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnA3T%2B97j6XS3kfaRxtJvdKSmgm0w9w41M49lyI%2FLNWA1%2Fzpk4T336Nnxpw3MyEgHTb1eECtBC4ly8uYkoYfbCI8F%2F7KjBrW94aEkQwUJGo8mg%3D%3D&chksm=681b69105f6ce006bb2d4bed2ffc4d5bedc2f597b0ef59082fc530bb1aa2d948be191e1d0de9#rd");
			article.setDescription("ƺɽ���������麣�����������ϻ����֡��Ϻ�֤ȯ���������й�������Ʊ");
			article.setTitle("�����ڴ������еİ���");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1008")){
			logger.info("V1008 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96SliasRaiaWwlp4764gibgJae97z9n93GLOic6Q40z82Rp6EMCBrZibrvD4wIEyw4FJ8ptbcMMwuGliab2w/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnDU%2F9uBKDVsrO%2Ba4KYj8yNvGuar9OmUOszqngkFsq5berkfQQ0GBa5AgLlFuw6Bw4H1eECtBC4ly8uYkoYfbCI8f38%2FEi2fgtS7117ay6s%2B8w%3D%3D&chksm=681b69495f6ce05f2daf98ef410ae106b03e2f25b0716756a11e7919441b26008b2d476835ec#rd");
			article.setDescription("��Ӫ�̽��ڴ����ݰ���1���ͻ���Ϊ����---��ǩ����׼�ػ�������׼Ӫ��2���ͻ�����Ⱥ�����---�����߶�����Ͷ�Ż������3��֤ȯ����������Spark�����ط���---Σ��Ԥ����������...");
			article.setTitle("��Ӫ�̽��ڴ����ݽ������");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1009")){
			logger.info("V1009 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96SliasRaiaWwlp4764gibgJae9iaudSNibzMQUXwC30b6cykiaosL7D1jTusOaWER5ZicXTxDuU49JGAegLw/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnAAMKiQXZs8Jy%2BsuKunJqxXPokGF1SqWCI23c4mrZ2BS2AcMQ0nGsWEYqbpjpsV06v1eECtBC4ly8uYkoYfbCI8pTczKNA6almobJ3fuZ1%2B1w%3D%3D&chksm=681b69565f6ce04009d61f76199b78e669434c4837d261ac60d950d428f36b7cc04d7dbf8bfd#rd");
			article.setDescription("����������ҵ�����ݷ�����1�������ݼ�ط���ƽ̨ 2������΢����վ�ɼ����������Ƽ�ϵͳ 3��������������ͼ����Ⱥ�ṹ�ͱ�ǩ...");
			article.setTitle("����������ҵ�����ݽ������");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName,articlelist);
		}else if(eventKey.equals("V1010")){
			logger.info("V1010 IS TRUE");
			article.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/pFQSMLRX96QNeubDVoU51Hro2W6sBRxFqODADpnsyOcMrldwk35VEeTOqvnSzthCibPYIIxTwBPgrUeBYhjXic1w/0?wx_fmt=jpeg");
			article.setUrl("http://mp.weixin.qq.com/s?__biz=MzIyMzcwNzU5Ng==&tempkey=U%2Bu58%2BRX%2BnJ%2F6zZsPEMMCFUMCeyqPgjlBnAFzyETAnA3T%2B97j6XS3kfaRxtJvdKSmgm0w9w41M49lyI%2FLNWA1%2Fzpk4T336Nnxpw3MyEgHTaR8PfAU75wj0Ay%2BN8GfhEr2vm9mVIHZeVHdJ%2BFxXpgwQ%3D%3D&chksm=681b69105f6ce006bb2d4bed2ffc4d5bedc2f597b0ef59082fc530bb1aa2d948be191e1d0de9#rd");
			article.setDescription("��ҵ�����ݰ��� 1����ҵ�������ݲɼ������׷��Ӫ�� 2��ȫ�������������ռ���ͳһ��ͼ 3������Hadoop����DW/BI����Ա�ͻ��ػ�����...");
			article.setTitle("��ҵ�����ݷ���");
			articlelist.add(article);
			responseMessage = MessageResponse.getNewsMessage(fromUserName, toUserName, articlelist);
		}else{
			
			String respContent = "�������";
			responseMessage = MessageResponse.getTextMessage(fromUserName, toUserName, respContent);
		}
		return responseMessage;
	}
	

}
