# Create a single ConfigMap from multiple YAML files
```shell script
kubectl create cm my-web-app-config \
  --from-file=application-default.yml \
  --from-file=application-operator.yml
```