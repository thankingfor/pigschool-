## 接收数据：

### 商品信息
+ id：商品id
+ title：商品标题
+ price：商品价格
+ oldPrice：商品
+ condition：成色
+ sellerId：卖家id
+ description：商品描述
+ sellerName：卖家称呼（区别于卖家昵称）
+ sellerContactWay：卖家联系方式（传递参数：1-QQ，2-微信，3-电话）
+ sellerContact：联系号码

```
{
  "id": 1001,
  "title": "棒球帽，加绒，原价99，现在只需10元！包邮！包邮！包邮！包邮！包邮！包邮！快来啊！",
  "price": 9.8,
  "oldPrice": 998,
  "condition": 9,
  "sellerId": 1001,
  "description":  "这是一顶不是绿色的帽子。",
  "sellerName": "张先生",
  "sellerContactWay": "1",
  "sellerContact": "641411169"
}
```

### 卖家信息
+ id：卖家id
+ name：卖家昵称
+ level：信誉等级



## 备注
区分 `卖家昵称` 和 `卖家称呼`

卖家昵称：校园猪平台的网名
![卖家昵称](http://pj1wbw4gq.bkt.clouddn.com/18-12-19/25046802.jpg)

卖家称呼：通常为真实姓名
![卖家称呼](http://pj1wbw4gq.bkt.clouddn.com/18-12-19/49613157.jpg)