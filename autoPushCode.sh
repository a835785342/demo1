cd /Users/jiangyoushengcai/Library/CloudStorage/OneDrive-个人/demo1
git config --global http.proxy http://127.0.0.1:7890
git add .
git commit -m "6点自动提交"
git push origin main
git config --global --unset http.proxy