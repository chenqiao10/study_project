package com.hwf.auto.dao;

import com.hwf.auto.bean.TableStruct;

/**
* 生成Bean实体类的dao层接口
* @author 
*
*/
public interface BeanAutoDao {	

//通过表名、字段名称、字段类型创建Bean实体
public boolean createBean();
}
