package com.pulan.entity;

import java.util.List;

/** 
 * 图文消息 
 *  
 * @author jiangyin 
 */
public class NewsMessage extends BaseMessage {
	
	// ͼ����Ϣ����������Ϊ10������ 
    private int ArticleCount;  
 // ����ͼ����Ϣ��Ϣ��Ĭ�ϵ�1��Ϊ��ͼ
    private List<Article> Articles;  
  
    public int getArticleCount() {  
        return ArticleCount;  
    }  
  
    public void setArticleCount(int articleCount) {  
        ArticleCount = articleCount;  
    }  
  
    public List<Article> getArticles() {  
        return Articles;  
    }  
  
    public void setArticles(List<Article> articles) {  
        Articles = articles;  
    }
}
