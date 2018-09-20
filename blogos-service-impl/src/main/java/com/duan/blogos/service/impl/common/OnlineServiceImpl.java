package com.duan.blogos.service.impl.common;

import com.duan.blogos.service.dto.blogger.BloggerAccountDTO;
import com.duan.blogos.service.restful.ResultModel;
import com.duan.blogos.service.service.common.OnlineService;
import org.springframework.stereotype.Service;

/**
 * Created on 2018/9/14.
 *
 * @author DuanJiaNing
 */
@Service
public class OnlineServiceImpl implements OnlineService {

    @Override
    public int getLoginBloggerId(String token) {

//        HttpSession session = request.getSession();
//        Object obj = session.getAttribute(bloggerProperties.getSessionNameOfBloggerId());
//        return obj == null ? -1 : (Integer) obj;

        // TODO redis + token 维护会话
        return -1;
    }

    @Override
    public ResultModel login(BloggerAccountDTO account) {
        return null;
    }

    @Override
    public ResultModel logout(BloggerAccountDTO account) {
        return null;
    }

}
