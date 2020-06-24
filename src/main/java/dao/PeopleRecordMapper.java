package dao;

import entity.view.PeopleRecord;

public interface PeopleRecordMapper {
    int insert(PeopleRecord record);

    int insertSelective(PeopleRecord record);
}