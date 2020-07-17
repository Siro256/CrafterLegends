# CrafterLegends
このリポジトリで開発中です
## 機能
### コマンド
| コマンド名 | エイリアス | 概要 | 権限 |
| :--- | :--- | :--- | :--- |
| test | cltest | 開発用 | clegends.developer |
### 権限
| 権限名 | 概要 | デフォルト | children |
| :--- | :--- | :--- | :--- |
| clegends.player | プレイヤー用権限<br> clegends.adminと同時に所有不可 | not op | - |
| clegends.admin | 管理者/運営者用権限<br> clegends.playerと同時に所有不可 | op | - |
| clegends.developer | 開発用 | false | clegends.admin<br> clegends.player |