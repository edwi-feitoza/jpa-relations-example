USE [master]
GO
IF DB_ID('relacionamentos') IS NOT NULL
    SET noexec ON
CREATE DATABASE [relacionamentos];
GO
USE [cars]
GO
