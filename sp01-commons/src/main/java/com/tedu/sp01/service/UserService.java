package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;


public interface UserService {
	/**
	 * ��ȡ�û���Ϣ
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * �޸Ļ���
	 * @param id
	 * @param score
	 */
	void addScore(Integer id, Integer score);
}