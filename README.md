# PivoBackend
цель проекта: научиться связывать бэк и фронт и деплоить их в облако Azure

пробовала залить в azure разными способами
1) сама создавала docker контейнеры и Dockerfile и пушила напрямую в acr (azure container registry)
2) используя CI/CD: GithubActions + Azure AppService 

репы которые заливала в azure\
бэк:  https://github.com/AnnaEleeva/Pivo \
фронт:  https://github.com/AnnaEleeva/PivoFrontend (учила React + JavaScript)

![img.png](image1.png)

как добавить образ в acr

```bash
docker login <registry-name>.azurecr.io --username <registry-username>

в корне проекта
mvn clean package -DskipTests   (создаем target jar)
docker init                     (создаем Dockerfile)           

docker build -t test1artifactregistry.azurecr.io/pivo . -f Dockerfile --platform linux/amd64

docker run  --publish 8080:8080 test1artifactregistry.azurecr.io/pivo
docker push test1artifactregistry.azurecr.io/pivo
```

