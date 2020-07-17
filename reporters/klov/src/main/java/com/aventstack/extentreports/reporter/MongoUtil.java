package com.aventstack.extentreports.reporter;

import org.bson.Document;
import org.bson.types.ObjectId;

public class MongoUtil {
    private MongoUtil() {
    }

    public static ObjectId getId(Document doc) {
        return (ObjectId) doc.get("_id");
    }
}
