package com.wenlei.community.dao.elasticsearch;

import com.wenlei.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussPostRepository extends ElasticsearchRepository <DiscussPost,Integer>{

    //泛型声明我这个接口处理哪个实体类，以及这个实体类的主键的类型
}
