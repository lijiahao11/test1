package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 获取商品数据
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 减少商品库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}