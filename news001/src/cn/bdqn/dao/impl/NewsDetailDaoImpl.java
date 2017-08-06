package cn.bdqn.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.dao.NewsDetailDao;
import cn.bdqn.util.BaseDao;

public class NewsDetailDaoImpl extends BaseDao implements NewsDetailDao {

	public List<News_Detail> findAllNewsDetail() {
		
		String sql="select * from news_detail";
		rs=this.executeQuery(sql);
		List<News_Detail> news_Details=new ArrayList<News_Detail>();
		try {
			while(rs.next()){
				News_Detail detail=new News_Detail();
				detail.setId(rs.getInt("id"));
				detail.setAuthor(rs.getString("author"));
				detail.setCategoryId(rs.getInt("categoryId"));
				detail.setTitle(rs.getString("title"));
				detail.setContent(rs.getString("content"));
				detail.setSummary(rs.getString("summary"));
				detail.setPicPath(rs.getString("picPath"));
				detail.setCreateDate(rs.getDate("createDate"));
				detail.setModifyDate(rs.getDate("modifyDate"));
				
				news_Details.add(detail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConnection();
		}
		
		return news_Details;
	}

	public int DelByNewsDetailId(int id) {
		String sql="delete from news_detail where id=?";
		Object [] params={id};
		
		return this.executeUpdate(sql, params);
	}

}
