package com.example.demo.mapper;

import com.example.demo.model.azericard.Parm;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class AzericardConstants {

    public static final String ADDRESS_TYPE = "SMS_1";
    public static final String ADDRESS_LINE = "SMS";
    public static final String NOTIFICATION_ACTIVE = "SMS_STATUS=Active";
    public static final String NOTIFICATION_DEACTIVE = "SMS_STATUS=Inactive";
    public static final String ACTIVE = "Active";
    public static final String DEACTIVE = "Deactive";
    public static final String REGEX = "amp;";

    public static final String INSTITUTION = "0010";
    public static final String ORDER_DPRT = "0101";
    public static final String REG_NUMBER_PREFIX = "IBAR-UFX-XML-";
    public static final String APP_NAME = "IBAR";
    public static final String SHORT_NAME = "&lt;&lt;&lt;NONE&gt;&gt;&gt;";
    public static final String MSG_TYPE_APP = "Application";
    public static final String MSG_TYPE_INFO = "Information";
    public static final String SCHEME = "WAY4Appl";
    public static final String DIRECTION = "Rq";
    public static final String VERSION = "2.0";
    public static final String SUCCESS_RESP_CODE = "0";
    public static final String SUCCESS_PROSSESED = "Successfully proccessed";

    public static final String MSG_TYPE_DOC = "Doc";
    public static final String SCHEME_DOC = "WAY4Doc";
    public static final String RNN = "RRN";
    public static final String AUTH_CODE = "AuthCode";
    public static final String TELLER = "010-TELLER";
    public static final String CANCEL_CODE = "acq_preauthorization_cash_rev";
    public static final String TRANS_CONDITION = ",TBAPPL,MNET,ENET,NO_SECURE,LINE_SECURE,NO_CARD,NO_TERM,";
    public static final String TRANS_RULE_CODE = "CashCodeType";
    public static final String TRANS_RULE_VALUE = "P2P_CASH_WB";
    public static final String CASH_CODE = "CashCode";
    public static final String CONTRACT_NUMBER = "90100001";

    public static final List<Parm> resultDtls = List.of(new Parm("n", "v"), new Parm("n", "v"), new Parm("n", "v"));

    private AzericardConstants() {
    }
}
