FROM node:22

COPY . frontend/

WORKDIR frontend/

RUN npm i

RUN npm run build

CMD ["npm","run","start"]
