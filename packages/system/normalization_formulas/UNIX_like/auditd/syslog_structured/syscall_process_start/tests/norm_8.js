{
  "action": "start",
  "object": "process",
  "status": "failure",
  "category.generic": "Process",
  "category.high": "Availability Management",
  "category.low": "Control",
  "chain_id": "156375916",
  "datafield1": "airflow schedul",
  "datafield4": "/usr/local/bin/python3.7",
  "datafield5": "/usr/local/sbin/git",
  "event_src.category": "Operating system",
  "event_src.ip": "10.0.0.12",
  "event_src.rule": "pt_siem_execve",
  "event_src.subsys": "auditd",
  "event_src.title": "unix_like",
  "id": "PT_UNIX_like_auditd_syslog_structured_syscall_process_start",
  "importance": "low",
  "labels": "node_contains_ext_ip",
  "msgid": "execve",
  "object.account.group": "root",
  "object.account.id": "0",
  "object.account.name": "root",
  "object.process.cwd": "/usr/local/airflow",
  "object.process.fullpath": "/usr/local/sbin/git",
  "object.process.id": "30761",
  "object.process.meta": "airflow scheduler - DagFileProcessor /usr/local/airflow/dags/migrator_exchange.py",
  "object.process.name": "git",
  "object.process.parent.id": "30753",
  "object.process.path": "/usr/local/sbin/",
  "reason": "No such file or directory",
  "subject.account.id": "0",
  "subject.account.name": "root",
  "subject.account.privileges": "0",
  "subject.account.session_id": "4294967295",
  "time": "2022-05-05T17:31:17.000Z"
}