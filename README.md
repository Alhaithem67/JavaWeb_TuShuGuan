# JavaWeb 图书管理系统
基于 JavaWeb + Servlet + MySQL 实现的图书管理系统，包含管理员登录、图书增删改查、图书分类、借阅管理等核心功能，适合作为 JavaWeb 入门实战项目。

---

## 技术栈
- 后端：Java、Servlet、JSP
- 数据库：MySQL
- 前端：HTML、CSS、JavaScript、Bootstrap
- 构建工具：Maven
- 版本控制：Git & GitHub

---

## 功能模块
- 管理员登录、退出
- 图书信息管理（新增、修改、删除、查询）
- 图书分类管理
- 图书借阅与归还记录
- 数据列表分页展示
- 简单权限控制

---

## 项目结构
src/
├── main/
│ ├── java/ # 后端代码、Servlet、Service、Dao
│ ├── webapp/ # HTML 页面、静态资源
│ └── resources/ # 配置文件
pom.xml # Maven 依赖
README.md # 项目说明


---

## 快速运行
1. 克隆项目到本地
git clone https://github.com/Alhaithem67/JavaWeb_TuShuGuan.git
2.创建数据库，执行 SQL 脚本
3.修改数据库连接配置（用户名、密码）
4.使用 Tomcat 启动项目
5.访问地址：http://localhost:8080/user_load.html

---

## 登陆账号
- 管理员账号：admin
- 密码：123456

## 项目亮点
- 结构清晰，适合 JavaWeb 初学者学习
- 完整 MVC 分层思想
- 基础 CRUD 操作齐全
- 界面简洁易用，加入基米图片呈现轻松氛围

## 后续优化方向
- 加入Redis缓存热门图书
- 增加借阅时限提醒和借阅记录
- 完善日志，异常处理
