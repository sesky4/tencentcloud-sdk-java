import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.hcm.v20181106.HcmClient;
import com.tencentcloudapi.hcm.v20181106.models.EvaluationRequest;
import com.tencentcloudapi.hcm.v20181106.models.EvaluationResponse;

public class EvaluationExample {

    public static void main(String[] args) {
        try {
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); // post请求(默认为post请求)
            httpProfile.setConnTimeout(60); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("soe.ap-beijing.tencentcloudapi.com"); // 指定接入地域域名(默认就近接入)

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);

            HcmClient hcmClient = new HcmClient(cred, "");
            EvaluationRequest evaluationRequest = new EvaluationRequest();
            evaluationRequest.setSessionId("123456");
            evaluationRequest.setImage("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");
            evaluationRequest.setUrl("");
            evaluationRequest.setHcmAppId("");

            EvaluationResponse evaluationResponse = hcmClient.Evaluation(evaluationRequest);
            System.out.println(evaluationResponse.getItems());
            System.out.println(evaluationResponse.getRequestId());
            System.out.println(evaluationResponse.getSessionId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }

    }
}
