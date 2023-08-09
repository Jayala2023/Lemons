package pro100.ayala.juan;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Controller {

    MongoDatabase database;

    public Controller(){
        ServerApi api = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString("mongodb://localhost:2717/"))
                .serverApi(api)
                .build();

        try (MongoClient mongo = MongoClients.create(settings)){
            database = mongo.getDatabase("poorDash");
            addCustomer();
        } catch (MongoException mx) {
            System.out.println(mx.toString());
        }
    }

    public void addCustomer(){
        Customer test = new Customer();
        Document writeDoc = new Document("username", test.getUsername()).append("password", test.getPassword()).append("firstName", test.getFirstName())
                .append("lastName", test.getLastName()).append("email", test.getEmail()).append("phone", test.getPhone()).append("address", test.getAddress())
                .append("city", test.getCity()).append("state", test.getState()).append("zip", test.getZip());
        MongoCollection<Document> customers = database.getCollection("customers");
        customers.insertOne(writeDoc);
    }
}
