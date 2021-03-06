package tech.wetech.weshop.fallback;

import tech.wetech.weshop.api.Api;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.query.WrapperPageQuery;
import tech.wetech.weshop.utils.Result;

import java.util.List;

public abstract class ApiFallback<T> implements Api<T> {

    @Override
    public Result<List<T>> queryAll() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<T>> queryList(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<T>> queryPageList(WrapperPageQuery<T> wrapperPageQuery) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<T> queryOne(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<T> queryById(Object id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> create(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> updateAll(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> updateNotNull(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> delete(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> deleteById(Object id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Integer> count(T entity) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<String> sayHello(String name) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
