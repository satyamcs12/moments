# moments
life  moments

#docker login to acr
docker login moments.azurecr.io

# docker
docker build -t moments-app:latest .
docker tag  moments-app:latest moments.azurecr.io/samples/moments-app:latest
docker push moments.azurecr.io/samples/moments-app:latest
