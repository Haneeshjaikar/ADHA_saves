{{/*
K8S API Server URL
*/}}
{{- define "cluster.server" -}}
{{- .Values.cluster.server }}
{{- end }}

{{/*
K8S Cluster Name
*/}}
{{- define "cluster.name" -}}
{{- .Values.cluster.name }}
{{- end }}

{{/*
K8S cluster user
*/}}
{{- define "cluster.user" -}}
{{- .Values.cluster.user }}
{{- end }}

{{/*
K8S cluster CA
*/}}
{{- define "cluster.certAuthData" -}}
{{- .Values.cluster.certAuthData }}
{{- end }}

{{/*
K8S cluster client cert
*/}}
{{- define "cluster.clientCertData" -}}
{{- .Values.cluster.clientCertData }}
{{- end }}

{{/*
K8S cluster client key
*/}}
{{- define "cluster.clientKeyData" -}}
{{- .Values.cluster.clientKeyData }}
{{- end }}

{{/*
K8S cluster token
*/}}
{{- define "cluster.token" -}}
{{- .Values.cluster.token }}
{{- end }}
