package com.msjf.finance.sas.facade.organ;
import com.msjf.finance.msjf.core.response.Response;
import com.msjf.finance.sas.facade.organ.domain.OrganInfoDomain;
import java.util.List;

/**
 * Created by 11509 on 2018/12/18.
 */
public interface OrganInfoFacade {
    public Response<List<OrganInfoDomain>> queryOrganInfoList();
}
