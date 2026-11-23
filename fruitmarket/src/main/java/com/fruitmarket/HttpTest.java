package com.fruitmarket;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpTest {
    public static void main(String[] args) throws Exception {
        // 1. 创建 HttpClient 客户端
        HttpClient client = HttpClient.newHttpClient();

        // 2. 准备要发送的 JSON 数据（注意转义符号）
        String json = "{\"number\":\"99\",\"name\":\"测试大西瓜\",\"price\":99.9,\"unit\":\"个\"}";

        // 3. 构建 POST 请求
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/fruit/add"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        // 4. 发送请求
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 5. 打印服务器返回的结果
        System.out.println("HTTP 状态码: " + response.statusCode());
        System.out.println("服务器返回的 JSON 结果: " + response.body());
    }
}
