# Create a single ConfigMap from multiple properties files
```shell script
kubectl create cm my-web-app-config \
  --from-env-file=application-default.properties \
  --from-env-file=application-operator.properties
```