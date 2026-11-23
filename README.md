# 🍉 生鲜超市商品管理系统 (Fruit Market System)

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.9-brightgreen)
![MyBatis](https://img.shields.io/badge/MyBatis-3.5-red)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)

## 📖 项目简介
本项目是一个基于 **Spring Boot + MyBatis** 的前后端分离式商品管理系统。
项目原型为传统的 **Java Swing + 原生 JDBC** 桌面端应用，为了适应主流企业级开发规范，我对其进行了**全面重构**。重构后的系统不仅大幅减少了冗余代码，还提升了接口安全性与系统可维护性。

## 🛠️ 技术栈
- **后端开发**：Java 17, Spring Boot 4.x, Spring Web MVC
- **持久层**：MyBatis, HikariCP (数据库连接池)
- **数据库**：MySQL 8.x
- **前端交互**：HTML5, 原生 JavaScript (Fetch API), CSS3
- **开发工具**：IntelliJ IDEA, Maven, Navicat

## ✨ 核心功能
- [x] **商品查询**：支持查询所有水果信息，并在前端列表展示。
- [x] **多条件动态查询**：支持根据编号、名称、价格、单位进行组合筛选（基于 MyBatis 动态 SQL）。
- [x] **商品添加**：支持输入商品信息（含编号查重拦截），并持久化到数据库。
- [x] **全局异常处理**：拦截系统内部错误，返回统一友好的 JSON 提示，防止堆栈信息泄露。
- [x] **统一结果封装**：封装统一的 `Result` 返回对象（包含 code、msg、data），规范前后端交互。

## 💡 架构重构亮点 (重点)
本项目在重构过程中解决了以下痛点：
1. **告别原生 JDBC 的冗余**：引入 MyBatis，彻底消除手工获取连接、处理 ResultSet 和释放资源的样板代码，实现持久层解耦。
2. **解决 SQL 注入风险**：废弃原版本字符串拼接 SQL 的方式，全面使用 MyBatis 的 `#{}` 占位符进行预编译，保障系统安全。
3. **工程化与规范化**：采用标准的 Maven 目录结构，引入 HikariCP 高性能连接池；封装全局异常拦截器，使接口更加健壮。

## 📸 页面预览
<img width="1920" height="1020" alt="QQ_1795435599951" src="https://github.com/user-attachments/assets/0c788830-8356-422c-b206-44f3c6048263" />

## 🚀 如何运行本项目
1. 克隆代码到本地：
   ```bash
   git clone https://github.com/Alkane-70/fruit-market-system.git
   ```
2. 导入数据库：在 MySQL 中创建一个名为 fruit 的数据库，并执行建表语句。
3. 修改配置：打开 src/main/resources/application.yml，修改数据库账号和密码为你的本地配置。
4. 启动项目：运行 FruitmarketApplication.java 中的 main 方法。
5. 访问页面：浏览器打开 http://localhost:8080/index.html。
