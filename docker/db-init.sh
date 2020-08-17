sleep 30
echo "Running set up scrips..."
/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P merda -d master -i db-init.sql
