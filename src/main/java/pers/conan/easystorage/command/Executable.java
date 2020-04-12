package pers.conan.easystorage.command;

import pers.conan.easystorage.annotation.Structure;

import java.util.List;
import java.util.Map;

/**
 * 接口：可执行
 * @author Conan Jordan
 */
public interface Executable {

    /**
     * 执行(SQL语句)
     * @return 查询结果集
     */
    List<Structure> execute();

    /**
     * 执行(SQL语句)
     * @return 记录条数(INSERT, UPDATE, DELETE)
     */
    int executeUpdate();

}
