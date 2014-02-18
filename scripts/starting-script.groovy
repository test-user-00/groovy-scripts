// Get the data source, the main entry point
ds = mc.getDataManager().getDataSource()
// Get an SQL object to work with
sql = groovy.sql.Sql.newInstance(ds)
