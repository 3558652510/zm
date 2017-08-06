package cn.bdqn.dao;

import java.util.List;

import cn.bdqn.bean.News_Detail;


public interface NewsDetailDao  {

	/**
	 * 
	 * @return所有新闻信息
	 */
	List<News_Detail> findAllNewsDetail();
	
	/**
	 * 
	 * @param id 需要删除的新闻信息编号
	 * @return 是否成功
	 */
	int DelByNewsDetailId(int id);
	
}
