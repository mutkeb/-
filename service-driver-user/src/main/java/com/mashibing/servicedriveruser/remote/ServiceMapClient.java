package com.mashibing.servicedriveruser.remote;

import com.mashibing.internalcommon.dto.ResponseResult;
import com.mashibing.internalcommon.response.TermnialResponse;
import com.mashibing.internalcommon.response.TrackResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-map")
public interface ServiceMapClient {

    @RequestMapping(method = RequestMethod.POST,value = "/terminal/add")
    public ResponseResult<TermnialResponse> addTerminal(@RequestParam String name,@RequestParam String desc);

    @RequestMapping(method = RequestMethod.POST,value = "/track/add")
    public ResponseResult<TrackResponse> addTrack(@RequestParam String tid);
}
