# 第9回講義課題 (自主)
## 課題の内容 
JUnitを使ってSpringアプリケーションにテストを実装してみる

## 構成要件
Java 17  
Gradle 7.4.1  
Spring Boot 2.6.7  

## アプリケーションの内容
- 試験の合格判定アプリケーション
- 数学の試験の点数(math)と理科の試験の点数(science)の点数をGETメソッドで送信し、RequestParamでmathとscienceの値を受け取り、その点数に応じて合否判定を返却
- 数学と理科両方の点数が80点以上である場合に「合格です」を返却
- 数学と理科どちらかの点数が80点以上である場合に「追試です」を返却
- 数学と理科両方の点数が80点未満である場合に「不合格です」を返却
- 点数が0点未満または101点以上である場合に例外処理として「点数は0から100までの数値を入力してください」を返却
| <img width="577" alt="スクリーンショット 2022-06-22 17 48 50" src="https://user-images.githubusercontent.com/103230014/174989062-a19b2b2b-f50c-4e3f-b35d-82d6dc2ae93a.png"> |
| : - : |

## テストについて
- ExaminationServiceTest.javaでテストを実装
- examination-service-test.mdにテスト仕様書を記載
- テスト結果  
| <img width="604" alt="スクリーンショット 2022-06-22 17 12 48" src="https://user-images.githubusercontent.com/103230014/174989041-f93b1e24-39ed-4075-9a1e-5052ecfa5865.png"> |
| : - : |


