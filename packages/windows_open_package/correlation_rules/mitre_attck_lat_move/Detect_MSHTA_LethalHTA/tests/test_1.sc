{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-05-14T01:29:04.3068859Z\"},\"EventRecordID\":\"17589\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2000\",\"ThreadID\":\"1960\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2019-05-14 01:29:04.293\"},{\"Name\":\"ProcessGuid\",\"text\":\"{365abb72-19e0-5cda-0000-001006711000}\"},{\"Name\":\"ProcessId\",\"text\":\"1932\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\mshta.exe\"},{\"Name\":\"FileVersion\",\"text\":\"11.00.9600.16428 (winblue_gdr.131013-1700)\"},{\"Name\":\"Description\",\"text\":\"Microsoft (R) HTML Application host\"},{\"Name\":\"Product\",\"text\":\"Internet Explorer\"},{\"Name\":\"Company\",\"text\":\"Microsoft Corporation\"},{\"Name\":\"CommandLine\",\"text\":\"C:\\\\Windows\\\\System32\\\\mshta.exe -Embedding\"},{\"Name\":\"CurrentDirectory\",\"text\":\"C:\\\\Windows\\\\system32\\\\\"},{\"Name\":\"User\",\"text\":\"IEWIN7\\\\IEUser\"},{\"Name\":\"LogonGuid\",\"text\":\"{365abb72-19e0-5cda-0000-0020ce701000}\"},{\"Name\":\"LogonId\",\"text\":\"0x1070ce\"},{\"Name\":\"TerminalSessionId\",\"text\":\"0\"},{\"Name\":\"IntegrityLevel\",\"text\":\"High\"},{\"Name\":\"Hashes\",\"text\":\"SHA1=D4F0397F83083E1C6FB0894187CC72AEBCF2F34F,MD5=ABDFC692D9FE43E2BA8FE6CB5A8CB95A,SHA256=949485BA939953642714AE6831D7DCB261691CAC7CBB8C1A9220333801F60820,IMPHASH=00B1859A95A316FD37DFF4210480907A\"},{\"Name\":\"ParentProcessGuid\",\"text\":\"{365abb72-965e-5cda-0000-0010af760000}\"},{\"Name\":\"ParentProcessId\",\"text\":\"596\"},{\"Name\":\"ParentImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\svchost.exe\"},{\"Name\":\"ParentCommandLine\",\"text\":\"C:\\\\Windows\\\\system32\\\\svchost.exe -k DcomLaunch\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield6": "365abb72-19e0-5cda-0000-0020ce701000", "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.privileges": "High", "object.account.session_id": "1077454", "object.process.cmdline": "C:\\Windows\\System32\\mshta.exe -Embedding", "object.process.cwd": "C:\\Windows\\system32\\", "object.process.fullpath": "c:\\windows\\system32\\mshta.exe", "object.process.guid": "365abb72-19e0-5cda-0000-001006711000", "object.process.hash.imphash": "00B1859A95A316FD37DFF4210480907A", "object.process.hash.md5": "ABDFC692D9FE43E2BA8FE6CB5A8CB95A", "object.process.hash.sha1": "D4F0397F83083E1C6FB0894187CC72AEBCF2F34F", "object.process.hash.sha256": "949485BA939953642714AE6831D7DCB261691CAC7CBB8C1A9220333801F60820", "object.process.id": "1932", "object.process.meta": "Description:Microsoft (R) HTML Application host | Product:Internet Explorer | Company:Microsoft Corporation", "object.process.name": "mshta.exe", "object.process.parent.cmdline": "C:\\Windows\\system32\\svchost.exe -k DcomLaunch", "object.process.parent.fullpath": "c:\\windows\\system32\\svchost.exe", "object.process.parent.guid": "365abb72-965e-5cda-0000-0010af760000", "object.process.parent.id": "596", "object.process.parent.name": "svchost.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "11.00.9600.16428 (winblue_gdr.131013-1700)", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-12T08:45:24.710Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "High", "subject.account.session_id": "1077454", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-05-14T01:29:04.293Z", "type": "raw", "uuid": "42ea9d06-caab-4e77-8c83-a91b43405d02"}
{"action": "detect", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"3\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"3\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-05-14T01:29:05.5345219Z\"},\"EventRecordID\":\"17590\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2000\",\"ThreadID\":\"1980\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2019-05-14 01:29:00.318\"},{\"Name\":\"ProcessGuid\",\"text\":\"{365abb72-19e0-5cda-0000-001006711000}\"},{\"Name\":\"ProcessId\",\"text\":\"1932\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\mshta.exe\"},{\"Name\":\"User\",\"text\":\"IEWIN7\\\\IEUser\"},{\"Name\":\"Protocol\",\"text\":\"tcp\"},{\"Name\":\"Initiated\",\"text\":\"false\"},{\"Name\":\"SourceIsIpv6\",\"text\":\"false\"},{\"Name\":\"SourceIp\",\"text\":\"10.0.2.16\"},{\"Name\":\"SourceHostname\",\"text\":\"IEWIN7\"},{\"Name\":\"SourcePort\",\"text\":\"49168\"},{\"Name\":\"SourcePortName\"},{\"Name\":\"DestinationIsIpv6\",\"text\":\"false\"},{\"Name\":\"DestinationIp\",\"text\":\"10.0.2.17\"},{\"Name\":\"DestinationHostname\"},{\"Name\":\"DestinationPort\",\"text\":\"55683\"},{\"Name\":\"DestinationPortName\"}]}}}", "category.generic": "Connection", "category.high": "Network Interaction Management", "category.low": "State", "direction": "ingress", "dst.host": "10.0.2.17", "dst.ip": "10.0.2.17", "dst.port": 55683, "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_3_Network_connection", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "3", "normalized": true, "object": "connection", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.process.fullpath": "c:\\windows\\system32\\mshta.exe", "object.process.guid": "365abb72-19e0-5cda-0000-001006711000", "object.process.id": "1932", "object.process.name": "mshta.exe", "object.process.path": "c:\\windows\\system32\\", "protocol": "tcp", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-12T08:45:24.710Z", "src.host": "iewin7", "src.hostname": "iewin7", "src.ip": "10.0.2.16", "src.port": 49168, "status": "success", "subject": "rule", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-05-14T01:29:00.318Z", "type": "raw", "uuid": "27430ec6-12a9-4209-b17b-32e1373f73ba"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action": "start", "alert.context": "C:\\Windows\\system32\\svchost.exe -k DcomLaunch -> C:\\Windows\\System32\\mshta.exe -Embedding", "alert.key": "c:\\windows\\system32\\svchost.exe -k dcomlaunch|c:\\windows\\system32\\mshta.exe -embedding|description:microsoft (r) html application host | product:internet explorer | company:microsoft corporation", "category.generic": "Attack", "category.high": "Lateral Movement", "category.low": "Remote Services: Distributed Component Object Model", "correlation_name": "Detect_MSHTA_LethalHTA", "correlation_type": "incident", "count": 1, "dst.host": "10.0.2.17", "dst.ip": "10.0.2.17", "dst.port": 55683, "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "correlationengine", "generator.version": "26.0.3002 (libservice v.2.0.787)", "importance": "medium", "incident.aggregation.key": "Detect_MSHTA_LethalHTA|iewin7", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "normalized": true, "object": "process", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.session_id": "1077454", "object.process.cmdline": "C:\\Windows\\System32\\mshta.exe -Embedding", "object.process.cwd": "C:\\Windows\\system32\\", "object.process.fullpath": "c:\\windows\\system32\\mshta.exe", "object.process.guid": "365abb72-19e0-5cda-0000-001006711000", "object.process.id": "1932", "object.process.meta": "Description:Microsoft (R) HTML Application host | Product:Internet Explorer | Company:Microsoft Corporation", "object.process.name": "mshta.exe", "object.process.parent.cmdline": "C:\\Windows\\system32\\svchost.exe -k DcomLaunch", "object.process.parent.fullpath": "c:\\windows\\system32\\svchost.exe", "object.process.parent.guid": "365abb72-965e-5cda-0000-0010af760000", "object.process.parent.id": "596", "object.process.parent.name": "svchost.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "11.00.9600.16428 (winblue_gdr.131013-1700)", "src.host": "iewin7", "src.ip": "10.0.2.16", "src.port": 49168, "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "High", "subject.account.session_id": "1077454", "time": "2019-05-14T01:29:04.293Z"}