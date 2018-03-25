package com.crystal.resourcemanager;

import android.text.TextUtils;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * 聚合所有属性对外提供
 */
public class DeviceConfiguration implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 开关旋钮广播
     * 多个数据之间用 ',' 逗号间隔
     */
    private String knobAction = "";
    /**
     * 旋钮状态文件位置
     */
    private String knobPath = "";
    private String knobOpenState = "1";
    private String knobCloseState = "0";
    /**
     * 切组延迟，用于适配无屏终端和有屏终端切组延时不一样的问题，单位毫秒，默认0ms
     */
    private String switchGroupDelay = "0";

    /********************* 组切广播两个 **********************/
    /**
     * 当旋钮向左旋转时，系统发送左旋转的广播ACTION的定义
     */
    private String groupChangeLeftAction = "";
    /**
     * 当旋钮向右旋转时，系统发送右旋转的广播ACTION的定义
     */
    private String groupChangeRightAction = "";
    /********************* 组切广播两个 **********************/




    /********************* 组切换广播一个，携带参数 **********************/
    /**
     * 切组广播ACTION定义,携带参数的定义 {@link DeviceConfiguration#changeGroupExtra}
     */
    private String changeGroupAction = "";
    /**
     * 切组广播参数Bundle.key定义
     */
    private String changeGroupExtra = "";

    private String changeGroupLeftExtra = "";

    private String changeGroupRightExtra = "";
    /********************* 组切换广播一个，携带参数 **********************/




    /******************* 单按键组切广播两个 **********************/
    private String groupChangeButtonDownAction = "";
    private String groupChangeButtonUpAction = "";
    /******************* 单按键组切广播两个 *********************/



    /*******************  单按键组切一个短按/长按  *********************/
    private String groupChangeButtonClickAction = "";
    private String groupChangeButtonLongpressAction = "";
    /*******************  单按键组切一个短按/长按  *********************/


    /******************* 单按键组切换广播一个，携带参数 *********************/
    private String changeGroupButtonAction = "";
    private String changeGroupButtonExtra = "";
    private String changeGroupButtonDownExtral = "";
    private String changeGroupButtonUpExtral = "";
    /******************* 单按键组切换广播一个，携带参数 *********************/





    /*********************  PTT按键有两个广播DOWN和UP  **********************/
    /**
     * PTT DOWN广播ACTION定义
     */
    private String pttDownAction = "";
    /**
     * PTT UP广播ACTION定义
     */
    private String pttUpAction = "";
    /*********************  PTT按键有两个广播DOWN和UP  **********************/




    /*********************  PTT按键广播有一个，广播中携带参数区分DOWN和UP  **********************/
    private String pttKeyAction = "";
    /**
     * 广播中参数的KEY(Bundle.key)
     */
    private String pttKeyExtral = "";
    /**
     * PTT按键参数down对应的值
     */
    private String pttKeyDownValue = "";
    /**
     * PTT按键参数up对应的值
     */
    private String pttKeyUpValue = "";
    /*********************  PTT按键广播有一个，广播中携带参数区分DOWN和UP  **********************/




    private String pttKeyCode = "";

    /*********************  自定义按键1两个广播 DOWN/UP  **********************/
    private String customDownAction = "";
    private String customUpAction = "";
    /*********************  自定义按键1两个广播 DOWN/UP  **********************/


    /*********************  自定义按键1一个短按/长按  **********************/
    private String customClickAction = "";
    private String customLongpressAction = "";
    /*********************  自定义按键1一个短按/长按  **********************/


    /*********************  自定义按键1一个广播携带参数  **********************/
    private String customKeyAction = "";
    private String customKeyExtral = "";
    private String customKeyValueDownExtral = "";
    private String customKeyValueUpExtral = "";
    /*********************  自定义按键1一个广播携带参数  **********************/

    /*********************  自定义按键2两个广播 DOWN/UP  **********************/
    private String custom2DownAction = "";
    private String custom2UpAction = "";
    /*********************  自定义按键2两个广播 DOWN/UP  **********************/


    /*********************  自定义按键2一个短按/长按  **********************/
    private String custom2ClickAction = "";
    private String custom2LongpressAction = "";
    /*********************  自定义按键2一个短按/长按  **********************/


    /*********************  自定义按键2一个广播携带参数  **********************/
    private String custom2KeyAction = "";
    private String custom2KeyExtral = "";
    private String custom2KeyValueDownExtral = "";
    private String custom2KeyValueUpExtral = "";
    /*********************  自定义按键2一个广播携带参数  **********************/



    /*********************  SOS按键两个广播 DOWN/UP  **********************/
    private String sosDownAction = "";
    private String sosUpAction = "";
    /*********************  SOS按键两个广播 DOWN/UP  **********************/


    /*********************  SOS按键一个广播携带参数  **********************/
    private String sosKeyAction = "";
    private String sosKeyExtral = "";
    private String sosKeyExtralValueDown = "";
    private String sosKeyExtralValueUp = "";
    /*********************  SOS按键一个广播携带参数  **********************/


    /********************* SOS按键一个短按/长按  **********************/
    private String sosClickAction = "";
    private String sosLongpressAction = "";
    /*********************  SOS按键一个短按/长按  **********************/

    /********************* 手咪配置 **********************/
    /**
     * 手咪插入时的广播
     */
    private String headsetPlugAction = "";
    private String headsetPlugExtra = "";
    private String headsetPlugExtraValueIn = "1";
    private String headsetPlugExtraValueOut = "0";

    /**
     * 手咪PTT 两个广播ACTION定义
     */
    private String headsetPttDownAction = "";
    private String headsetPttUpAction = "";
    /**
     * 手咪PTT 单广播ACTION定义
     */
    private String headsetPttKeyAction = "";
    private String headsetPttKeyExtral = "";
    private String headsetPttKeyDownValue = "";
    private String headsetPttKeyUpValue = "";

    /********************* 手咪配置 **********************/



    /********************* 指示灯配置  **********************/
    /**
     * 红灯广播ACTION定义
     */
    private String ledRedAction = "";
    private String ledGreenAction = "";
    private String ledBlueAction = "";
    /**
     * 黄灯广播ACTION定义
     */
    private String ledYellowAction = "";

    /**
     * 关灯广播定义
     */
    private String ledOffAction = "";
    /********************* 指示灯配置  **********************/


    /********************* 指示灯配置,根据广播参数控制指示灯颜色和等级  **********************/
    private String ledControlAction = "";
    private String ledContrColorExtra = "";
    private String ledContrLevelExtra = "";
    private String ledContrBrightExtra = "";
    private String ledContrOffExtra = "";
    private String ledContrOffAction = "";
    private String ledContrRedValueExtra = "";
    private String ledContrGreenValueExtra = "";
    private String ledContrYellowValueExtra = "";
    private String ledContrBlueValueExtra = "";

    /********************* 指示灯配置,根据广播参数控制指示灯颜色和等级  **********************/

    /**
     * 是否支持切换语言 1支持 ， 0不支持。
     */
    private String supportChangeLanguage = "";

    /**
     * #是否支持wifi  0不支持，其他支持
     */
    private String deviceSupportWifi = "";
    /**
     * 设备对红色LED的支持
     */
    private String deviceSupportRedled = "";
    /**
     * 设备对绿色LED的支持
     */
    private String deviceSupportGreenled = "";
    /**
     * 设备对黄色LED的支持
     */
    private String deviceSupportYellowled = "";
    /**
     * 设备对蓝色色LED的支持
     */
    private String deviceSupportBlueled = "";
    /**
     * 是否支持音量旋钮测试 1支持 ， 0不支持。
     */
    private String supportVolKnobTest = "";

    /**
     * 低电量百分比
     */
    private String deviceLowbattryScale = "";
    /**
     * 是否支持系统电话
     */
    private String supportSystemCall = "";
    /**
     * 是否支持OTA升级
     */
    private String deviceSupportOTAUpdate = "";
    /**
     * 生产厂家
     */
    private String company = "";
    /**
     * 设备型号
     */
    private String deviceModel = "";

    /**
     * 是否支持静默升级
     */
    private String supportSilentUpgrade = "";

    /**
     * 是否支持语音播报
     */
    private String supportTTS = "";

    /**
     * 按键键值适配
     */
    private String KeyEventsAdapter = "";

    private String m6InterfaceSetting = "";

    private String supportFullScreen = "";
    private String supportAllFooter = "1";
    private String isDpadDirection = "0";

    private String knob_extral = "";




    public int getSwitchGroupDelay() {
        try{
            int delayTime = Integer.valueOf(switchGroupDelay);
            return delayTime;
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    public String getGroupChangeButtonDownAction() {
        return groupChangeButtonDownAction;
    }

    public void setGroupChangeButtonDownAction(String groupChangeButtonDownAction) {
        this.groupChangeButtonDownAction = groupChangeButtonDownAction == null ?"":groupChangeButtonDownAction;
    }

    public String getGroupChangeButtonUpAction() {
        return groupChangeButtonUpAction;
    }

    public void setGroupChangeButtonUpAction(String groupChangeButtonUpAction) {
        this.groupChangeButtonUpAction = groupChangeButtonUpAction == null ?"":groupChangeButtonUpAction;
    }

    public String getGroupChangeButtonClickAction() {
        return groupChangeButtonClickAction;
    }

    public void setGroupChangeButtonClickAction(String groupChangeButtonClickAction) {
        this.groupChangeButtonClickAction = groupChangeButtonClickAction == null ?"":groupChangeButtonClickAction;
    }

    public String getGroupChangeButtonLongpressAction() {
        return groupChangeButtonLongpressAction;
    }

    public void setGroupChangeButtonLongpressAction(String groupChangeButtonLongpressAction) {
        this.groupChangeButtonLongpressAction = groupChangeButtonLongpressAction == null ?"":groupChangeButtonLongpressAction;
    }

    public String getChangeGroupButtonAction() {
        return changeGroupButtonAction;
    }

    public void setChangeGroupButtonAction(String changeGroupButtonAction) {
        this.changeGroupButtonAction = changeGroupButtonAction == null ?"":changeGroupButtonAction;
    }

    public String getChangeGroupButtonExtra() {
        return changeGroupButtonExtra;
    }

    public void setChangeGroupButtonExtra(String changeGroupButtonExtra) {
        this.changeGroupButtonExtra = changeGroupButtonExtra == null ?"":changeGroupButtonExtra;
    }

    public int getChangeGroupButtonDownExtral() {
        if (!TextUtils.isEmpty(changeGroupButtonDownExtral)) {
            try {
                return Integer.valueOf(changeGroupButtonDownExtral);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    public void setChangeGroupButtonDownExtral(String changeGroupButtonDownExtral) {
        this.changeGroupButtonDownExtral = changeGroupButtonDownExtral == null ?"":changeGroupButtonDownExtral;
    }

    public int getChangeGroupButtonUpExtral() {
        if (!TextUtils.isEmpty(changeGroupButtonUpExtral)) {
            try {
                return Integer.valueOf(changeGroupButtonUpExtral);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    public void setChangeGroupButtonUpExtral(String changeGroupButtonUpExtral) {
        this.changeGroupButtonUpExtral = changeGroupButtonUpExtral == null ? "" : changeGroupButtonUpExtral;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getKnobAction() {
        return knobAction;
    }

    public String getKnobPath() {
        return knobPath;
    }

    public String getKnobOpenState() {
        return knobOpenState;
    }

    public String getKnobCloseState() {
        return knobCloseState;
    }

    public String getGroupChangeLeftAction() {
        return groupChangeLeftAction;
    }

    public String getGroupChangeRightAction() {
        return groupChangeRightAction;
    }

    public String getChangeGroupAction() {
        return changeGroupAction;
    }

    public String getChangeGroupExtra() {
        return changeGroupExtra;
    }


    public int getChangeGroupLeftExtra() {
        if (!TextUtils.isEmpty(changeGroupLeftExtra)) {
            try {
                return Integer.valueOf(changeGroupLeftExtra);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public int getChangeGroupRightExtra() {
        if (!TextUtils.isEmpty(changeGroupRightExtra)) {
            try {
                return Integer.valueOf(changeGroupRightExtra);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }


    public String getPttDownAction() {
        return pttDownAction;
    }

    public String getPttUpAction() {
        return pttUpAction;
    }

    public String getPttKeyAction() {
        return pttKeyAction;
    }

    public String getPttKeyExtral() {
        return pttKeyExtral;
    }

    public int getPttKeyDownValue() {
        if (!TextUtils.isEmpty(pttKeyDownValue)) {
            try {
                return Integer.valueOf(pttKeyDownValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    public int getPttKeyUpValue() {
        if (!TextUtils.isEmpty(pttKeyUpValue)) {
            try {
                return Integer.valueOf(pttKeyUpValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public int getPttKeyCode() {
        if (!TextUtils.isEmpty(pttKeyCode)) {
            try {
                return Integer.valueOf(pttKeyCode);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public String getCustomDownAction() {
        return customDownAction;
    }

    public String getCustomUpAction() {
        return customUpAction;
    }

    public String getCustomClickAction() {
        return customClickAction;
    }

    public String getCustomLongpressAction() {
        return customLongpressAction;
    }

    public String getCustomKeyAction() {
        return customKeyAction;
    }

    public String getCustomKeyExtral() {
        return customKeyExtral;
    }

    public int getCustomKeyValueDownExtral() {
        if (!TextUtils.isEmpty(customKeyValueDownExtral)) {
            try {
                return Integer.valueOf(customKeyValueDownExtral);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    public int getCustomKeyValueUpExtral() {
        if (!TextUtils.isEmpty(customKeyValueUpExtral)) {
            try {
                return Integer.valueOf(customKeyValueUpExtral);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public String getCustom2DownAction() {
        return custom2DownAction;
    }

    public String getCustom2UpAction() {
        return custom2UpAction;
    }

    public String getCustom2ClickAction() {
        return custom2ClickAction;
    }

    public String getCustom2LongpressAction() {
        return custom2LongpressAction;
    }

    public String getCustom2KeyAction() {
        return custom2KeyAction;
    }

    public String getCustom2KeyExtral() {
        return custom2KeyExtral;
    }

    public int getCustom2KeyValueDownExtral() {
        if (!TextUtils.isEmpty(custom2KeyValueDownExtral)) {
            try {
                return Integer.valueOf(custom2KeyValueDownExtral);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    public int getCustom2KeyValueUpExtral() {
        if (!TextUtils.isEmpty(customKeyValueUpExtral)) {
            try {
                return Integer.valueOf(customKeyValueUpExtral);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public String getSosDownAction() {
        return sosDownAction;
    }

    public String getSosUpAction() {
        return sosUpAction;
    }

    public String getSosKeyAction() {
        return sosKeyAction;
    }

    public String getSosKeyExtral() {
        return sosKeyExtral;
    }

    public int getSosKeyExtralValueDown() {
        if (!TextUtils.isEmpty(sosKeyExtralValueDown)) {
            try {
                return Integer.valueOf(sosKeyExtralValueDown);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    public int getSosKeyExtralValueUp() {
        if (!TextUtils.isEmpty(sosKeyExtralValueUp)) {
            try {
                return Integer.valueOf(sosKeyExtralValueUp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public String getSosClickAction() {
        return sosClickAction;
    }

    public String getSosLongpressAction() {
        return sosLongpressAction;
    }

    public String getLedRedAction() {
        return ledRedAction;
    }

    public String getLedGreenAction() {
        return ledGreenAction;
    }

    public String getLedBlueAction() {
        return ledBlueAction;
    }

    public String getLedYellowAction() {
        return ledYellowAction;
    }

    public String getLedOffAction() {
        return ledOffAction;
    }

    public String getLedControlAction() {
        return ledControlAction;
    }

    public String getLedContrColorExtra() {
        return ledContrColorExtra;
    }

    public String getLedContrLevelExtra() {
        return ledContrLevelExtra;
    }

    public String getLedContrBrightExtra() {
        return ledContrBrightExtra;
    }
    public String getLedContrOffExtra() {
        return ledContrOffExtra;
    }

    public String getLedContrOffAction() {
        return ledContrOffAction;
    }

    public String getLedContrRedValueExtra() {
        return ledContrRedValueExtra;
    }

    public String getLedContrGreenValueExtra() {
        return ledContrGreenValueExtra;
    }

    public String getLedContrYellowValueExtra() {
        return ledContrYellowValueExtra;
    }

    public String getLedContrBlueValueExtra() {
        return ledContrBlueValueExtra;
    }

    public String getSupportChangeLanguage() {
        return supportChangeLanguage;
    }

    public boolean isSupportChangeLanguage() {
        return "1".equals(supportChangeLanguage);
    }

    public String getDeviceSupportWifi() {
        return deviceSupportWifi;
    }

    public boolean isDeviceSupportWifi() {
        return "1".equals(deviceSupportWifi);
    }

    public String getDeviceSupportRedled() {
        return deviceSupportRedled;
    }

    public boolean isDeviceSupportRedled() {
        return "1".equals(deviceSupportRedled);
    }

    public String getDeviceSupportGreenled() {
        return deviceSupportGreenled;
    }

    public boolean isDeviceSupportGreenled() {
        return "1".equals(deviceSupportGreenled);
    }

    public String getDeviceSupportYellowled() {
        return deviceSupportYellowled;
    }
    public boolean isDeviceSupportYellowled() {
        return "1".equals(deviceSupportYellowled);
    }
    public String getDeviceSupportBlueled() {
        return deviceSupportBlueled;
    }
    public boolean isDeviceSupportBlueled() {
        return "1".equals(deviceSupportBlueled);
    }
    public String getSupportVolKnobTest() {
        return supportVolKnobTest;
    }

    public boolean isSupportVolKnobTest() {
        return !("0".equals(supportVolKnobTest));
    }

    public String getDeviceLowbattryScaleString() {
        return deviceLowbattryScale;
    }

    public int getDeviceLowbattryScale() {
        if(!TextUtils.isEmpty(deviceLowbattryScale)){
            try {
                return  Integer.parseInt(deviceLowbattryScale);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return 15;
    }


    public String getSupportSystemCall() {
        return supportSystemCall;
    }

    public Boolean isSupportSystemCall() {
        return !"0".equals(supportSystemCall);
    }

    public String getDeviceSupportOTAUpdate() {
        return deviceSupportOTAUpdate;
    }
    public Boolean isDeviceSupportOTAUpdate() {
        return !"0".equals(deviceSupportOTAUpdate);
    }

    public String getCompany() {
        return company;
    }
    public String getDeviceModel() {
        return deviceModel;
    }
    public String getSupportSilentUpgrade() {
        return supportSilentUpgrade;
    }
    public Boolean isSupportSilentUpgrade() {
        return "0".equals(supportSilentUpgrade);
    }

    public boolean isSupportTTS() {
        return "1".equals(supportTTS);
    }

    public String getHeadsetPlugAction() {
        return headsetPlugAction;
    }

    public String getHeadsetPlugExtra() {
        return headsetPlugExtra;
    }

    public String getHeadsetPlugExtraValueIn() {
        return headsetPlugExtraValueIn;
    }

    public String getHeadsetPlugExtraValueOut() {
        return headsetPlugExtraValueOut;
    }

    public String getHeadsetPttDownAction() {
        return headsetPttDownAction;
    }

    public String getHeadsetPttUpAction() {
        return headsetPttUpAction;
    }

    public String getHeadsetPttKeyAction() {
        return headsetPttKeyAction;
    }

    public String getHeadsetPttKeyExtral() {
        return headsetPttKeyExtral;
    }

    public String getHeadsetPttKeyDownValue() {
        return headsetPttKeyDownValue;
    }

    public String getHeadsetPttKeyUpValue() {
        return headsetPttKeyUpValue;
    }


    public String getKeyEventsAdapter() {
        return KeyEventsAdapter;
    }

    public String getM6InterfaceSetting() {
        return m6InterfaceSetting;
    }

    public boolean isSupportFullScreen() {
        return !TextUtils.isEmpty(supportFullScreen) && supportFullScreen.equals("1");
    }

    public boolean isSupportAllFooter() {
        return "1".equals(supportAllFooter);
    }

    public boolean isDpadDirection() {
        return "1".equals(isDpadDirection);
    }

    public void setKnobAction(String knobAction) {
        this.knobAction = knobAction==null?"":knobAction;
    }

    public void setKnobPath(String knobPath) {
        this.knobPath = knobPath==null?"":knobPath;
    }

    public void setKnobOpenState(String knobOpenState) {
        this.knobOpenState = knobOpenState==null?"":knobOpenState;
    }

    public void setKnobCloseState(String knobCloseState) {
        this.knobCloseState = knobCloseState==null?"": knobCloseState;
    }

    public void setSwitchGroupDelay(String switchGroupDelay) {
        this.switchGroupDelay = switchGroupDelay;
    }

    public void setGroupChangeLeftAction(String groupChangeLeftAction) {
        this.groupChangeLeftAction = groupChangeLeftAction==null?"":groupChangeLeftAction;
    }

    public void setGroupChangeRightAction(String groupChangeRightAction) {
        this.groupChangeRightAction = groupChangeRightAction==null?"":groupChangeRightAction;
    }

    public void setChangeGroupAction(String changeGroupAction) {
        this.changeGroupAction = changeGroupAction==null?"":changeGroupAction;
    }

    public void setChangeGroupExtra(String changeGroupExtra) {
        this.changeGroupExtra = changeGroupExtra==null?"":changeGroupExtra;
    }

    public void setChangeGroupLeftExtra(String changeGroupLeftExtra) {
        this.changeGroupLeftExtra = changeGroupLeftExtra==null?"":changeGroupLeftExtra;
    }

    public void setChangeGroupRightExtra(String changeGroupRightExtra) {
        this.changeGroupRightExtra = changeGroupRightExtra==null?"":changeGroupRightExtra;
    }

    public void setPttDownAction(String pttDownAction) {
        if(!TextUtils.isEmpty(pttDownAction)){
            this.pttDownAction = pttDownAction;
        }
    }

    public void setPttUpAction(String pttUpAction) {
        if(!TextUtils.isEmpty(pttUpAction)){
            this.pttUpAction = pttUpAction;
        }
    }

    public void setPttKeyAction(String pttKeyAction) {
        this.pttKeyAction = pttKeyAction==null?"":pttKeyAction;
    }

    public void setPttKeyExtral(String pttKeyExtral) {
        this.pttKeyExtral = pttKeyExtral==null?"":pttKeyExtral;
    }

    public void setPttKeyDownValue(String pttKeyDownValue) {
        this.pttKeyDownValue = pttKeyDownValue==null?"":pttKeyDownValue;
    }

    public void setPttKeyUpValue(String pttKeyUpValue) {
        this.pttKeyUpValue = pttKeyUpValue==null?"":pttKeyUpValue;
    }

    public void setPttKeyCode(String pttKeyCode) {
        this.pttKeyCode = pttKeyCode==null?"":pttKeyCode;
    }

    public void setCustomDownAction(String customDownAction) {
        this.customDownAction = customDownAction==null?"":customDownAction;
    }

    public void setCustomUpAction(String customUpAction) {
        this.customUpAction = customUpAction==null?"":customUpAction;
    }

    public void setCustomClickAction(String customClickAction) {
        this.customClickAction = customClickAction==null?"":customClickAction;
    }

    public void setCustomLongpressAction(String customLongpressAction) {
        this.customLongpressAction = customLongpressAction==null?"":customLongpressAction;
    }

    public void setCustomKeyAction(String customKeyAction) {
        this.customKeyAction = customKeyAction==null?"":customKeyAction;
    }

    public void setCustomKeyExtral(String customKeyExtral) {
        this.customKeyExtral = customKeyExtral==null?"":customKeyExtral;
    }

    public void setCustomKeyValueDownExtral(String customKeyValueDownExtral) {
        this.customKeyValueDownExtral = customKeyValueDownExtral==null?"":customKeyValueDownExtral;
    }

    public void setCustomKeyValueUpExtral(String customKeyValueUpExtral) {
        this.customKeyValueUpExtral = customKeyValueUpExtral==null?"":customKeyValueUpExtral;
    }

    public void setCustom2DownAction(String custom2DownAction) {
        this.custom2DownAction = custom2DownAction;
    }

    public void setCustom2UpAction(String custom2UpAction) {
        this.custom2UpAction = custom2UpAction;
    }

    public void setCustom2ClickAction(String custom2ClickAction) {
        this.custom2ClickAction = custom2ClickAction;
    }

    public void setCustom2LongpressAction(String custom2LongpressAction) {
        this.custom2LongpressAction = custom2LongpressAction;
    }

    public void setCustom2KeyAction(String custom2KeyAction) {
        this.custom2KeyAction = custom2KeyAction;
    }

    public void setCustom2KeyExtral(String custom2KeyExtral) {
        this.custom2KeyExtral = custom2KeyExtral;
    }

    public void setCustom2KeyValueDownExtral(String custom2KeyValueDownExtral) {
        this.custom2KeyValueDownExtral = custom2KeyValueDownExtral;
    }

    public void setCustom2KeyValueUpExtral(String custom2KeyValueUpExtral) {
        this.custom2KeyValueUpExtral = custom2KeyValueUpExtral;
    }

    public void setSosDownAction(String sosDownAction) {
        this.sosDownAction = sosDownAction==null?"":sosDownAction;
    }

    public void setSosUpAction(String sosUpAction) {
        this.sosUpAction = sosUpAction==null?"":sosUpAction;
    }

    public void setSosKeyAction(String sosKeyAction) {
        this.sosKeyAction = sosKeyAction==null?"":sosKeyAction;
    }

    public void setSosKeyExtral(String sosKeyExtral) {
        this.sosKeyExtral = sosKeyExtral==null?"":sosKeyExtral;
    }

    public void setSosKeyExtralValueDown(String sosKeyExtralValueDown) {
        this.sosKeyExtralValueDown = sosKeyExtralValueDown==null?"":sosKeyExtralValueDown;
    }

    public void setSosKeyExtralValueUp(String sosKeyExtralValueUp) {
        this.sosKeyExtralValueUp = sosKeyExtralValueUp==null?"":sosKeyExtralValueUp;
    }

    public void setSosClickAction(String sosClickAction) {
        this.sosClickAction = sosClickAction==null?"":sosClickAction;
    }

    public void setSosLongpressAction(String sosLongpressAction) {
        this.sosLongpressAction = sosLongpressAction==null?"":sosLongpressAction;
    }

    public void setLedRedAction(String ledRedAction) {
        this.ledRedAction = ledRedAction==null?"":ledRedAction;
    }

    public void setLedGreenAction(String ledGreenAction) {
        this.ledGreenAction = ledGreenAction==null?"":ledGreenAction;
    }

    public void setLedBlueAction(String ledBlueAction) {
        this.ledBlueAction = ledBlueAction==null?"":ledBlueAction;
    }

    public void setLedYellowAction(String ledYellowAction) {
        this.ledYellowAction = ledYellowAction==null?"":ledYellowAction;
    }

    public void setLedOffAction(String ledOffAction) {
        this.ledOffAction = ledOffAction==null?"":ledOffAction;
    }

    public void setLedControlAction(String ledControlAction) {
        this.ledControlAction = ledControlAction==null?"":groupChangeLeftAction;
    }

    public void setLedContrColorExtra(String ledContrColorExtra) {
        this.ledContrColorExtra = ledContrColorExtra==null?"":ledContrColorExtra;
    }

    public void setLedContrLevelExtra(String ledContrLevelExtra) {
        this.ledContrLevelExtra = ledContrLevelExtra==null?"":ledContrLevelExtra;
    }

    public void setLedContrBrightExtra(String ledContrBrightExtra) {
        this.ledContrBrightExtra = ledContrBrightExtra==null?"":ledContrBrightExtra;
    }

    public void setLedContrOffExtra(String ledContrOffExtra) {
        this.ledContrOffExtra = ledContrOffExtra;
    }

    public void setLedContrOffAction(String ledContrOffAction) {
        this.ledContrOffAction = ledContrOffAction==null?"":ledContrOffAction;
    }

    public void setLedContrRedValueExtra(String ledContrRedValueExtra) {
        this.ledContrRedValueExtra = ledContrRedValueExtra;
    }

    public void setLedContrGreenValueExtra(String ledContrGreenValueExtra) {
        this.ledContrGreenValueExtra = ledContrGreenValueExtra;
    }

    public void setLedContrYellowValueExtra(String ledContrYellowValueExtra) {
        this.ledContrYellowValueExtra = ledContrYellowValueExtra;
    }

    public void setLedContrBlueValueExtra(String ledContrBlueValueExtra) {
        this.ledContrBlueValueExtra = ledContrBlueValueExtra;
    }

    public void setSupportChangeLanguage(String supportChangeLanguage) {
        this.supportChangeLanguage = supportChangeLanguage==null?"":supportChangeLanguage;
    }

    public void setDeviceSupportWifi(String deviceSupportWifi) {
        this.deviceSupportWifi = deviceSupportWifi==null?"":deviceSupportWifi;
    }

    public void setDeviceSupportRedled(String deviceSupportRedled) {
        this.deviceSupportRedled = deviceSupportRedled==null?"":deviceSupportRedled;
    }

    public void setDeviceSupportGreenled(String deviceSupportGreenled) {
        this.deviceSupportGreenled = deviceSupportGreenled==null?"":deviceSupportGreenled;
    }

    public void setDeviceSupportYellowled(String deviceSupportYellowled) {
        this.deviceSupportYellowled = deviceSupportYellowled==null?"":deviceSupportYellowled;
    }

    public void setDeviceSupportBlueled(String deviceSupportBlueled) {
        this.deviceSupportBlueled = deviceSupportBlueled==null?"":deviceSupportBlueled;
    }

    public void setSupportVolKnobTest(String supportVolKnobTest) {
        this.supportVolKnobTest = supportVolKnobTest==null?"":supportVolKnobTest;
    }

    public void setDeviceLowbattryScale(String deviceLowbattryScale) {
        this.deviceLowbattryScale = deviceLowbattryScale==null?"":deviceLowbattryScale;
    }

    public void setSupportSystemCall(String supportSystemCall) {
        this.supportSystemCall = supportSystemCall==null?"":supportSystemCall;
    }

    public void setDeviceSupportOTAUpdate(String deviceSupportOTAUpdate) {
        this.deviceSupportOTAUpdate = deviceSupportOTAUpdate;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    public void setSupportSilentUpgrade(String supportSilentUpgrade) {
        this.supportSilentUpgrade = supportSilentUpgrade;
    }

    public void setSupportTTS(String supportTTS) {
        this.supportTTS = supportTTS;
    }

    public void setHeadsetPlugAction(String headsetPlugAction) {
        this.headsetPlugAction = headsetPlugAction;
    }

    public void setHeadsetPlugExtra(String headsetPlugExtra) {
        this.headsetPlugExtra = headsetPlugExtra;
    }

    public void setHeadsetPlugExtraValueIn(String headsetPlugExtraValueIn) {
        this.headsetPlugExtraValueIn = headsetPlugExtraValueIn;
    }

    public void setHeadsetPlugExtraValueOut(String headsetPlugExtraValueOut) {
        this.headsetPlugExtraValueOut = headsetPlugExtraValueOut;
    }

    public void setHeadsetPttDownAction(String headsetPttDownAction) {
        this.headsetPttDownAction = headsetPttDownAction;
    }

    public void setHeadsetPttUpAction(String headsetPttUpAction) {
        this.headsetPttUpAction = headsetPttUpAction;
    }

    public void setHeadsetPttKeyAction(String headsetPttKeyAction) {
        this.headsetPttKeyAction = headsetPttKeyAction;
    }

    public void setHeadsetPttKeyExtral(String headsetPttKeyExtral) {
        this.headsetPttKeyExtral = headsetPttKeyExtral;
    }

    public void setHeadsetPttKeyDownValue(String headsetPttKeyDownValue) {
        this.headsetPttKeyDownValue = headsetPttKeyDownValue;
    }

    public void setHeadsetPttKeyUpValue(String headsetPttKeyUpValue) {
        this.headsetPttKeyUpValue = headsetPttKeyUpValue;
    }

    public void setKeyEventsAdapter(String keyEventsAdapter) {
        KeyEventsAdapter = keyEventsAdapter;
    }

    public void setM6InterfaceSetting(String m6InterfaceSetting) {
        this.m6InterfaceSetting = m6InterfaceSetting;
    }

    public void setSupportFullScreen(String supportFullScreen) {
        this.supportFullScreen = supportFullScreen;
    }

    public void setSupportAllFooter(String supportAllFooter) {
        this.supportAllFooter = supportAllFooter;
    }

    public void setIsDpadDirection(String isDpadDirection) {
        this.isDpadDirection = isDpadDirection;
    }

    public String getKnob_extral() {
        return knob_extral;
    }

    public void setKnob_extral(String knob_extral) {
        this.knob_extral = knob_extral;
    }

    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        StringBuffer buffer = new StringBuffer();
        for (Field field : fields) {
            if ("serialVersionUID".equals(field.getName())) continue;
            buffer.append(field.getName()).append(" = ");
            try {
                buffer.append(field.get(this).toString());
            } catch (Exception e) {
                e.printStackTrace();
                buffer.append(" ");
            }
            buffer.append(" , ").append("\n");
        }

        return buffer.toString();
    }

}