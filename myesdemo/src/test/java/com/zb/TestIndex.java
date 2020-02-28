package com.zb;

import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestIndex {
    @Autowired(required=false)
    private RestHighLevelClient restHighLevelClient;






    @Test
    public void deleteIndex() throws IOException {
        DeleteIndexRequest request=new DeleteIndexRequest("xc_course");
        DeleteIndexResponse deleteResponse=restHighLevelClient.indices().delete(request);
        System.out.println(deleteResponse.isAcknowledged());
    }

    @Test
    public void createIndex() throws Exception{
        CreateIndexRequest request=new CreateIndexRequest("xc_course", Settings.builder().put("number_of_shards","1").put("number_of_replicas","0").build());
        request.mapping("doc","{\n" +
                "\t\"properties\": {\n" +
                "\t\t\"description\": {\n" +
                "\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\"analyzer\": \"ik_max_word\",\n" +
                "\t\t\t\"search_analyzer\": \"ik_smart\"\n" +
                "\t\t},\n" +
                "\t\t\"name\": {\n" +
                "\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\"analyzer\": \"ik_max_word\",\n" +
                "\t\t\t\"search_analyzer\": \"ik_smart\"\n" +
                "\t\t},\n" +
                "\t\t\"pic\": {\n" +
                "\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\"index\": false\n" +
                "\t\t},\n" +
                "\t\t\"price\": {\n" +
                "\t\t\t\"type\": \"float\"\n" +
                "\t\t},\n" +
                "\t\t\"studymodel\": {\n" +
                "\t\t\t\"type\": \"keyword\"\n" +
                "\t\t},\n" +
                "\t\t\"timestamp\": {\n" +
                "\t\t\t\"type\": \"date\",\n" +
                "\t\t\t\"format\": \"yyyy-MM-dd HH:mm:ss||yyyy-MM-dd\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}", XContentType.JSON);
        CreateIndexResponse response=restHighLevelClient.indices().create(request);
        System.out.println(response.isAcknowledged());

    }

    @Test
    public void addDoc() throws Exception{
        Map<String,Object> jsonMap=new HashMap<>();
        jsonMap.put("name","spring cloud实战");
        jsonMap.put("description", "本课程主要从四个章节进行讲解： 1.微服务架构入门 2.spring cloud基础入门 3.实战Spring Boot 4.注册中心eureka。");
        jsonMap.put("studymodel", "201001");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jsonMap.put("timestamp",dateFormat.format(new Date()));
        jsonMap.put("price", 5.6f);
        IndexRequest request=new IndexRequest("xc_course","doc");
        request.source(jsonMap);
        IndexResponse indexResponse=restHighLevelClient.index(request);
        DocWriteResponse.Result result=indexResponse.getResult();
        System.out.println(result);
    }
    @Test
    public void getDoc() throws Exception{
        GetRequest request=new GetRequest("xc_course","doc","wSoze3ABH-2ZXRGquSzA");
        GetResponse getResponse=restHighLevelClient.get(request);
        Map<String,Object> map=getResponse.getSourceAsMap();
        System.out.println(map.get("name"));
    }
    @Test
    public void updateDoc() throws Exception{
        UpdateRequest request=new UpdateRequest("xc_course","doc","wSoze3ABH-2ZXRGquSzA");
        Map<String,Object> param=new HashMap<>();
        param.put("name","spring boot实战");
        request.doc(param);
        UpdateResponse updateResponse=restHighLevelClient.update(request);
        System.out.println(updateResponse.status());
    }
    @Test
    public void deleteDoc() throws Exception{
        DeleteRequest deleteRequest=new DeleteRequest("xc_course","doc","wSoze3ABH-2ZXRGquSzA");
        DeleteResponse deleteResponse=restHighLevelClient.delete(deleteRequest);
        System.out.println(deleteResponse.status());
    }
}
