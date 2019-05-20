package com.sihai.controller;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
public class AlipayConfig {
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092600600547";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDnZEA+ThBWsZ87DjpnRkjNaajJ2Lk8IBhHAGEGwuCg7hxUFdQQoZp+cVqhv5MegB6MX4cbyzR01uoO3TCl8gmqrJ9YK3pZZ+l/s5vNkn8TGZieX9qr6tKAT9SNKNByy42uOFhrrU/SYdcNO2XGP8BnpyAOzzpScEKFOszHhRdlFsfnptMl8BIQ8W5esCVrHT9/oOoC7w+b5l/xZhFuAh8AIilkwUHD05uQjsHluyDqwpEhHMraBrPBJEe0uG7q4E3WH7mdbjl7V6oN64IdrsA6tmhdr28zoK13mn/W9yQKmnI9W0U2IXgOVZ7ppuLvvknU88aIa/WuBqMzIa01oSQtAgMBAAECggEBALNVvnjLddxLE7bogxlRntEdJ8Uwo/fWhBpbT9e2p/PyN6BvvokZRqzi27RqzvIfqA1xaDyBVGmNu5/DjJXArf9KhMEICW5Lm+vuXz2HYdeCygdNESSW/YiW1oyE6nFeE7PIVbc2fpv2Wn8V3v40oMF1BOKVd4U3Hkc12Ep2ezhLYw0LGhds1ejHCqPI0CrKQN6so2+GlD339r/HkjOGbjOIq3Wwrt7XqiJ5N7V2KMm9ROCsGBNeliw3MZgX1qJ3y1DxnLRSAIFfbsoWE7q6VEqjxf/lb7IsFidL/tnipS46lby78/pORGcbwjcGIy+6HjR5HtWo2ZQd5GS9iXP5mh0CgYEA/gmK0Queh2ci3pvjPGdyLBaIN2G3VvxEINGzKgymW+k7C3eTrpWHMQ8beOb/Eq1wBzJtXUFVP/wQC9rg9mz9qEcwV50bHtFrS84A38xAi+mR9lGDC4wyX39ewFhIwYNaN3RudPz7dTPvHLyyeDLIvg1tjUPYB5PNrmPir8jBLJcCgYEA6S3rBezxdMgDIeNuvKIuZDFr3k0UKN+FRc2eqbwbTloG63QVr+6IsLaLruRDzGWKtlXrygiwrak4g1zr54sAoZKuIstN+/zwQ2ihf6S3nismaGw1qkCPKLtSzjpBOMbtohrFsFVcjRhctso5IIiv5xo1wKKSVMipau92ZkGM2dsCgYAqHobnlheYt57ubcZFU5l4edvn4sm1IGpjTqF4DVTf1FG32wGfZqddmPWjHBmajSsP5mp/lb9+tloqvQWjlfqQlg0L2b6PY4V4shUvBfyFtho/TtB9b6dCcinRllGp1A93NlTCDNfcXNn+V8L3buQdrrhFPcRprTXi/iitoIl2zQKBgQDX2Ep6xLdJy6+imf2ynUnmMx1PvPfRUf7y+4BITDjWkV1gbKd6oIplUcUBUokz1jbNy8Ek1mB9kGwgpU41miUuazHIQXthq+TX8S21k0rpHbZC6Q/QFkyufqALCD/Bh9sGuFOQg6PVc9y204CIDh8OBOQG+jYMR2cT9rAZvcndCwKBgQDSF0stcMCgxGmroYMOoBeRA3OllVxpfc2kYRmFvdN771TmtmNQUORY1Hfgg+e/OL6XmsaAuT+3zucWyWLqmYIARHtEid5h+3x9C9piWv5sBfH//tddAUgM+olTCEHHNgpp4gDMF054ZkzK+Z1biGMmM127+t9MHa/SNyvl3IfEWw==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2MvDUoRCHdIdv0kYpL+yEjYIGiiHsZMR6rEl0pQowfn7RzU0sSUylg3KU1PGUaIKqH58FYjEtywfcF5S2CjQRImyMCRJGz2Bt6XSGgzWp9OtH3lbNJdMmeF2ScmV6VzULt/QNiyC6SxBJqZ3f7aHYw96Cu3iVmqds1HrbrBTDgdmMlRQQCjsgm52NSLSFwtDt8hbcqFuszb/dy3ex2D+LYnJaekaTVNEx9gF255EJFK2q6qM9Yp+zRtmAbFWQQz5Yoqm1fWHxTfjOWJA9cHLSIygtKs7i1dYnx36upAPTYn0hkmdUn73X98OM9dvsfRH6vHXwBG/HJUpvXdeUgNviwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "E:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

