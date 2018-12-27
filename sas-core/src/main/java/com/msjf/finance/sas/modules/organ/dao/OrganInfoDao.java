package com.msjf.finance.sas.modules.organ.dao;
import com.msjf.finance.sas.common.dao.MyBatisDao;
import com.msjf.finance.sas.modules.organ.entity.OrganInfoEntity;
import java.util.List;

/**
 * Created by 11509 on 2018/12/18.
 */
@MyBatisDao
public interface OrganInfoDao{
    List<OrganInfoEntity> queryOrganInfoList();
}
