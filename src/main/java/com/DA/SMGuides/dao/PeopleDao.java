package com.DA.SMGuides.dao;

import com.DA.SMGuides.model.People;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * <PeopleDao>
 *
 * @Author： Huanghai
 * @Version: 2016-09-08
 **/
@Repository("peopleDao")
@Scope("singleton")
public interface PeopleDao {
    @Insert("INSERT INTO people (id,name) VALUES (#{id}, #{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insert(People people);
}
