package com.msjf.finance.sas.modules.organ.service.impl;

import com.msjf.finance.sas.facade.organ.domain.OrganInfoDomain;
import com.msjf.finance.sas.modules.organ.dao.OrganInfoDao;
import com.msjf.finance.sas.modules.organ.entity.OrganInfoEntity;
import com.msjf.finance.sas.modules.organ.service.OrganInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 11509 on 2018/12/18.
 */
@Service("organInfoService")
public class OrganInfoServiceImpl implements OrganInfoService {
    @Resource
    OrganInfoDao organInfoDao;
    public List queryOrganInfoList() {
       try {
            List<OrganInfoEntity> organInfoEntityList = organInfoDao.queryOrganInfoList();
            List<OrganInfoDomain> organInfoDomainList = new ArrayList();
            organInfoEntityList.stream().forEach(organInfoEntity ->
                    {
                        OrganInfoDomain organInfoDomain = new OrganInfoDomain();
                        BeanUtils.copyProperties(organInfoEntity, organInfoDomain);
                        organInfoDomainList.add(organInfoDomain);
                    }
            );
            return organInfoDomainList;
        }catch (Exception e){
               //打印错误日志
           e.printStackTrace();
        }
        return null;
    }
}
