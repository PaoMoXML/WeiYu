package io.renren.modules.WeiYu.Controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import io.renren.common.utils.R;
import io.swagger.annotations.ApiOperation;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/wechat")
public class WxController {

    @Autowired
    private WxMaService wxService;

    @GetMapping("/getSessionInfo")
    @ApiOperation("根据code获取SessionInfo")
    public R getSessionInfo(String code) {
        if (code != null && code.length() < 0) {
            return R.error("Code为空！");
        }
        try {
            WxMaJscode2SessionResult session = this.wxService.getUserService().getSessionInfo(code);
            return R.ok().put("session", session);
        } catch (WxErrorException e) {
            return R.error(e.toString());
        }
    }

    /**
     * 获取用户信息接口
     */
    @GetMapping("/info")
    @ApiOperation("获取用户信息接口")
    public R info(String sessionKey, String signature, String rawData, String encryptedData, String iv) {
        // 用户信息校验
        if (!this.wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return R.error("验证失败！");
        }

        // 解密用户信息
        WxMaUserInfo userInfo = this.wxService.getUserService().getUserInfo(sessionKey, encryptedData, iv);
        return R.ok().put("userInfo", userInfo);
    }

    /**
     * 获取用户绑定手机号信息
     */
    @GetMapping("/phone")
    @ApiOperation("获取用户绑定手机号信息")
    public R phone(String sessionKey, String signature, String rawData, String encryptedData, String iv) {
        // 用户信息校验
        if (!this.wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return R.error("验证失败！");
        }
        // 解密
        WxMaPhoneNumberInfo phoneNoInfo = this.wxService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, iv);
        return R.ok().put("phoneNoInfo", phoneNoInfo);
    }
}