### JOSDK Test

Example to reproduce [this bug](https://github.com/operator-framework/java-operator-sdk/issues/1978)

Run the command below:
```bash
mvn test
```

This will fail with error `java.lang.IncompatibleClassChangeError: Found class io.fabric8.kubernetes.api.model.NamespaceFluent$MetadataNested, but interface was expected`  
However, if you downgrade to fabric8 version 6.7.2 everything works fine.
