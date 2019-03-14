# Api说明
## 第三方Api

### 一淘(etao)

Api地址：http://suggest.taobao.com/sug?area=etao&code=utf-8&callback=KISSY.Suggest.callback&q=牛
```json
KISSY.Suggest.callback({
  "result":[
    ["牛仔裤男","19290327"],
    ["牛仔裤女","12731467"],
    ... ...
  ]
})
```

## 第一方Api
### 获取用户基本信息
+ 名称
+ 所在校园
+ ~~诚信值（划掉）~~
+ 用户消息
+ 系统通知
```
{
  "name": "EsunR",
  "school": "安阳工学院",
  "userMsg": 4,
  "sysMsg": 4
}
```
> 备注：诚信值分为三个等级，4为极好，3为良好，2为中等，1为极差

### 最新发布
+ 商品ID
+ 商品封面
+ 商品标题
+ 商品价格
+ 商品原价
```
{
  "id": 1001
  "cover": "../Data/SecondHand/ItemPic/1001/cover.jpg",
  "title": "商品标题",
  "price": 9.8,
  "oldPrice": 998
}
```

### 商品信息（复用型Api）
+ 商品封面
+ 商品价格
+ 商品原价
+ 商品标题
+ 发布者用户名
+ 发布者信用等级
```
{
  "id": 1001
  "cover": "../Data/SecondHand/ItemPic/1001/cover.jpg",
  "price": 9.8,
  "oldPrice": 998,
  "title": "商品标题",
  "sellerName": "EsunR",
  "sellerIntegrity": 4
}
```
> 备注：接口需要设置参数，查询关键字 `key`，所展示的区域 `area`