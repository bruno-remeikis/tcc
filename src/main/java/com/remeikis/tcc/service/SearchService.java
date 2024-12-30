package com.remeikis.tcc.service;

import org.opensearch.client.RestHighLevelClient;
import org.opensearch.client.RequestOptions;
import org.opensearch.client.RestClient;
import org.opensearch.client.indices.CreateIndexRequest;
import org.apache.http.HttpHost;
import java.io.IOException;

public class SearchService {

    public void teste() {
        RestHighLevelClient client = new RestHighLevelClient(
            RestClient.builder(new HttpHost("localhost", 9200, "http"))
        );
        try {
            CreateIndexRequest request = new CreateIndexRequest("my-index");
            client.indices().create(request, RequestOptions.DEFAULT);
            // Adicione a lógica para armazenar arquivos
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
}
