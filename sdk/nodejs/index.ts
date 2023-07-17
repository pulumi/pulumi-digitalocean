// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { AppArgs, AppState } from "./app";
export type App = import("./app").App;
export const App: typeof import("./app").App = null as any;
utilities.lazyLoad(exports, ["App"], () => require("./app"));

export { CdnArgs, CdnState } from "./cdn";
export type Cdn = import("./cdn").Cdn;
export const Cdn: typeof import("./cdn").Cdn = null as any;
utilities.lazyLoad(exports, ["Cdn"], () => require("./cdn"));

export { CertificateArgs, CertificateState } from "./certificate";
export type Certificate = import("./certificate").Certificate;
export const Certificate: typeof import("./certificate").Certificate = null as any;
utilities.lazyLoad(exports, ["Certificate"], () => require("./certificate"));

export { ContainerRegistryArgs, ContainerRegistryState } from "./containerRegistry";
export type ContainerRegistry = import("./containerRegistry").ContainerRegistry;
export const ContainerRegistry: typeof import("./containerRegistry").ContainerRegistry = null as any;
utilities.lazyLoad(exports, ["ContainerRegistry"], () => require("./containerRegistry"));

export { ContainerRegistryDockerCredentialsArgs, ContainerRegistryDockerCredentialsState } from "./containerRegistryDockerCredentials";
export type ContainerRegistryDockerCredentials = import("./containerRegistryDockerCredentials").ContainerRegistryDockerCredentials;
export const ContainerRegistryDockerCredentials: typeof import("./containerRegistryDockerCredentials").ContainerRegistryDockerCredentials = null as any;
utilities.lazyLoad(exports, ["ContainerRegistryDockerCredentials"], () => require("./containerRegistryDockerCredentials"));

export { CustomImageArgs, CustomImageState } from "./customImage";
export type CustomImage = import("./customImage").CustomImage;
export const CustomImage: typeof import("./customImage").CustomImage = null as any;
utilities.lazyLoad(exports, ["CustomImage"], () => require("./customImage"));

export { DatabaseClusterArgs, DatabaseClusterState } from "./databaseCluster";
export type DatabaseCluster = import("./databaseCluster").DatabaseCluster;
export const DatabaseCluster: typeof import("./databaseCluster").DatabaseCluster = null as any;
utilities.lazyLoad(exports, ["DatabaseCluster"], () => require("./databaseCluster"));

export { DatabaseConnectionPoolArgs, DatabaseConnectionPoolState } from "./databaseConnectionPool";
export type DatabaseConnectionPool = import("./databaseConnectionPool").DatabaseConnectionPool;
export const DatabaseConnectionPool: typeof import("./databaseConnectionPool").DatabaseConnectionPool = null as any;
utilities.lazyLoad(exports, ["DatabaseConnectionPool"], () => require("./databaseConnectionPool"));

export { DatabaseDbArgs, DatabaseDbState } from "./databaseDb";
export type DatabaseDb = import("./databaseDb").DatabaseDb;
export const DatabaseDb: typeof import("./databaseDb").DatabaseDb = null as any;
utilities.lazyLoad(exports, ["DatabaseDb"], () => require("./databaseDb"));

export { DatabaseFirewallArgs, DatabaseFirewallState } from "./databaseFirewall";
export type DatabaseFirewall = import("./databaseFirewall").DatabaseFirewall;
export const DatabaseFirewall: typeof import("./databaseFirewall").DatabaseFirewall = null as any;
utilities.lazyLoad(exports, ["DatabaseFirewall"], () => require("./databaseFirewall"));

export { DatabaseReplicaArgs, DatabaseReplicaState } from "./databaseReplica";
export type DatabaseReplica = import("./databaseReplica").DatabaseReplica;
export const DatabaseReplica: typeof import("./databaseReplica").DatabaseReplica = null as any;
utilities.lazyLoad(exports, ["DatabaseReplica"], () => require("./databaseReplica"));

export { DatabaseUserArgs, DatabaseUserState } from "./databaseUser";
export type DatabaseUser = import("./databaseUser").DatabaseUser;
export const DatabaseUser: typeof import("./databaseUser").DatabaseUser = null as any;
utilities.lazyLoad(exports, ["DatabaseUser"], () => require("./databaseUser"));

export { DnsRecordArgs, DnsRecordState } from "./dnsRecord";
export type DnsRecord = import("./dnsRecord").DnsRecord;
export const DnsRecord: typeof import("./dnsRecord").DnsRecord = null as any;
utilities.lazyLoad(exports, ["DnsRecord"], () => require("./dnsRecord"));

export { DomainArgs, DomainState } from "./domain";
export type Domain = import("./domain").Domain;
export const Domain: typeof import("./domain").Domain = null as any;
utilities.lazyLoad(exports, ["Domain"], () => require("./domain"));

export { DropletArgs, DropletState } from "./droplet";
export type Droplet = import("./droplet").Droplet;
export const Droplet: typeof import("./droplet").Droplet = null as any;
utilities.lazyLoad(exports, ["Droplet"], () => require("./droplet"));

export { DropletSnapshotArgs, DropletSnapshotState } from "./dropletSnapshot";
export type DropletSnapshot = import("./dropletSnapshot").DropletSnapshot;
export const DropletSnapshot: typeof import("./dropletSnapshot").DropletSnapshot = null as any;
utilities.lazyLoad(exports, ["DropletSnapshot"], () => require("./dropletSnapshot"));

export { FirewallArgs, FirewallState } from "./firewall";
export type Firewall = import("./firewall").Firewall;
export const Firewall: typeof import("./firewall").Firewall = null as any;
utilities.lazyLoad(exports, ["Firewall"], () => require("./firewall"));

export { FloatingIpArgs, FloatingIpState } from "./floatingIp";
export type FloatingIp = import("./floatingIp").FloatingIp;
export const FloatingIp: typeof import("./floatingIp").FloatingIp = null as any;
utilities.lazyLoad(exports, ["FloatingIp"], () => require("./floatingIp"));

export { FloatingIpAssignmentArgs, FloatingIpAssignmentState } from "./floatingIpAssignment";
export type FloatingIpAssignment = import("./floatingIpAssignment").FloatingIpAssignment;
export const FloatingIpAssignment: typeof import("./floatingIpAssignment").FloatingIpAssignment = null as any;
utilities.lazyLoad(exports, ["FloatingIpAssignment"], () => require("./floatingIpAssignment"));

export { GetAccountResult } from "./getAccount";
export const getAccount: typeof import("./getAccount").getAccount = null as any;
utilities.lazyLoad(exports, ["getAccount"], () => require("./getAccount"));

export { GetAppArgs, GetAppResult, GetAppOutputArgs } from "./getApp";
export const getApp: typeof import("./getApp").getApp = null as any;
export const getAppOutput: typeof import("./getApp").getAppOutput = null as any;
utilities.lazyLoad(exports, ["getApp","getAppOutput"], () => require("./getApp"));

export { GetCertificateArgs, GetCertificateResult, GetCertificateOutputArgs } from "./getCertificate";
export const getCertificate: typeof import("./getCertificate").getCertificate = null as any;
export const getCertificateOutput: typeof import("./getCertificate").getCertificateOutput = null as any;
utilities.lazyLoad(exports, ["getCertificate","getCertificateOutput"], () => require("./getCertificate"));

export { GetContainerRegistryArgs, GetContainerRegistryResult, GetContainerRegistryOutputArgs } from "./getContainerRegistry";
export const getContainerRegistry: typeof import("./getContainerRegistry").getContainerRegistry = null as any;
export const getContainerRegistryOutput: typeof import("./getContainerRegistry").getContainerRegistryOutput = null as any;
utilities.lazyLoad(exports, ["getContainerRegistry","getContainerRegistryOutput"], () => require("./getContainerRegistry"));

export { GetDatabaseCaArgs, GetDatabaseCaResult, GetDatabaseCaOutputArgs } from "./getDatabaseCa";
export const getDatabaseCa: typeof import("./getDatabaseCa").getDatabaseCa = null as any;
export const getDatabaseCaOutput: typeof import("./getDatabaseCa").getDatabaseCaOutput = null as any;
utilities.lazyLoad(exports, ["getDatabaseCa","getDatabaseCaOutput"], () => require("./getDatabaseCa"));

export { GetDatabaseClusterArgs, GetDatabaseClusterResult, GetDatabaseClusterOutputArgs } from "./getDatabaseCluster";
export const getDatabaseCluster: typeof import("./getDatabaseCluster").getDatabaseCluster = null as any;
export const getDatabaseClusterOutput: typeof import("./getDatabaseCluster").getDatabaseClusterOutput = null as any;
utilities.lazyLoad(exports, ["getDatabaseCluster","getDatabaseClusterOutput"], () => require("./getDatabaseCluster"));

export { GetDatabaseReplicaArgs, GetDatabaseReplicaResult, GetDatabaseReplicaOutputArgs } from "./getDatabaseReplica";
export const getDatabaseReplica: typeof import("./getDatabaseReplica").getDatabaseReplica = null as any;
export const getDatabaseReplicaOutput: typeof import("./getDatabaseReplica").getDatabaseReplicaOutput = null as any;
utilities.lazyLoad(exports, ["getDatabaseReplica","getDatabaseReplicaOutput"], () => require("./getDatabaseReplica"));

export { GetDatabaseUserArgs, GetDatabaseUserResult, GetDatabaseUserOutputArgs } from "./getDatabaseUser";
export const getDatabaseUser: typeof import("./getDatabaseUser").getDatabaseUser = null as any;
export const getDatabaseUserOutput: typeof import("./getDatabaseUser").getDatabaseUserOutput = null as any;
utilities.lazyLoad(exports, ["getDatabaseUser","getDatabaseUserOutput"], () => require("./getDatabaseUser"));

export { GetDomainArgs, GetDomainResult, GetDomainOutputArgs } from "./getDomain";
export const getDomain: typeof import("./getDomain").getDomain = null as any;
export const getDomainOutput: typeof import("./getDomain").getDomainOutput = null as any;
utilities.lazyLoad(exports, ["getDomain","getDomainOutput"], () => require("./getDomain"));

export { GetDomainsArgs, GetDomainsResult, GetDomainsOutputArgs } from "./getDomains";
export const getDomains: typeof import("./getDomains").getDomains = null as any;
export const getDomainsOutput: typeof import("./getDomains").getDomainsOutput = null as any;
utilities.lazyLoad(exports, ["getDomains","getDomainsOutput"], () => require("./getDomains"));

export { GetDropletArgs, GetDropletResult, GetDropletOutputArgs } from "./getDroplet";
export const getDroplet: typeof import("./getDroplet").getDroplet = null as any;
export const getDropletOutput: typeof import("./getDroplet").getDropletOutput = null as any;
utilities.lazyLoad(exports, ["getDroplet","getDropletOutput"], () => require("./getDroplet"));

export { GetDropletSnapshotArgs, GetDropletSnapshotResult, GetDropletSnapshotOutputArgs } from "./getDropletSnapshot";
export const getDropletSnapshot: typeof import("./getDropletSnapshot").getDropletSnapshot = null as any;
export const getDropletSnapshotOutput: typeof import("./getDropletSnapshot").getDropletSnapshotOutput = null as any;
utilities.lazyLoad(exports, ["getDropletSnapshot","getDropletSnapshotOutput"], () => require("./getDropletSnapshot"));

export { GetDropletsArgs, GetDropletsResult, GetDropletsOutputArgs } from "./getDroplets";
export const getDroplets: typeof import("./getDroplets").getDroplets = null as any;
export const getDropletsOutput: typeof import("./getDroplets").getDropletsOutput = null as any;
utilities.lazyLoad(exports, ["getDroplets","getDropletsOutput"], () => require("./getDroplets"));

export { GetFirewallArgs, GetFirewallResult, GetFirewallOutputArgs } from "./getFirewall";
export const getFirewall: typeof import("./getFirewall").getFirewall = null as any;
export const getFirewallOutput: typeof import("./getFirewall").getFirewallOutput = null as any;
utilities.lazyLoad(exports, ["getFirewall","getFirewallOutput"], () => require("./getFirewall"));

export { GetFloatingIpArgs, GetFloatingIpResult, GetFloatingIpOutputArgs } from "./getFloatingIp";
export const getFloatingIp: typeof import("./getFloatingIp").getFloatingIp = null as any;
export const getFloatingIpOutput: typeof import("./getFloatingIp").getFloatingIpOutput = null as any;
utilities.lazyLoad(exports, ["getFloatingIp","getFloatingIpOutput"], () => require("./getFloatingIp"));

export { GetImageArgs, GetImageResult, GetImageOutputArgs } from "./getImage";
export const getImage: typeof import("./getImage").getImage = null as any;
export const getImageOutput: typeof import("./getImage").getImageOutput = null as any;
utilities.lazyLoad(exports, ["getImage","getImageOutput"], () => require("./getImage"));

export { GetImagesArgs, GetImagesResult, GetImagesOutputArgs } from "./getImages";
export const getImages: typeof import("./getImages").getImages = null as any;
export const getImagesOutput: typeof import("./getImages").getImagesOutput = null as any;
utilities.lazyLoad(exports, ["getImages","getImagesOutput"], () => require("./getImages"));

export { GetKubernetesClusterArgs, GetKubernetesClusterResult, GetKubernetesClusterOutputArgs } from "./getKubernetesCluster";
export const getKubernetesCluster: typeof import("./getKubernetesCluster").getKubernetesCluster = null as any;
export const getKubernetesClusterOutput: typeof import("./getKubernetesCluster").getKubernetesClusterOutput = null as any;
utilities.lazyLoad(exports, ["getKubernetesCluster","getKubernetesClusterOutput"], () => require("./getKubernetesCluster"));

export { GetKubernetesVersionsArgs, GetKubernetesVersionsResult, GetKubernetesVersionsOutputArgs } from "./getKubernetesVersions";
export const getKubernetesVersions: typeof import("./getKubernetesVersions").getKubernetesVersions = null as any;
export const getKubernetesVersionsOutput: typeof import("./getKubernetesVersions").getKubernetesVersionsOutput = null as any;
utilities.lazyLoad(exports, ["getKubernetesVersions","getKubernetesVersionsOutput"], () => require("./getKubernetesVersions"));

export { GetLoadBalancerArgs, GetLoadBalancerResult, GetLoadBalancerOutputArgs } from "./getLoadBalancer";
export const getLoadBalancer: typeof import("./getLoadBalancer").getLoadBalancer = null as any;
export const getLoadBalancerOutput: typeof import("./getLoadBalancer").getLoadBalancerOutput = null as any;
utilities.lazyLoad(exports, ["getLoadBalancer","getLoadBalancerOutput"], () => require("./getLoadBalancer"));

export { GetProjectArgs, GetProjectResult, GetProjectOutputArgs } from "./getProject";
export const getProject: typeof import("./getProject").getProject = null as any;
export const getProjectOutput: typeof import("./getProject").getProjectOutput = null as any;
utilities.lazyLoad(exports, ["getProject","getProjectOutput"], () => require("./getProject"));

export { GetProjectsArgs, GetProjectsResult, GetProjectsOutputArgs } from "./getProjects";
export const getProjects: typeof import("./getProjects").getProjects = null as any;
export const getProjectsOutput: typeof import("./getProjects").getProjectsOutput = null as any;
utilities.lazyLoad(exports, ["getProjects","getProjectsOutput"], () => require("./getProjects"));

export { GetRecordArgs, GetRecordResult, GetRecordOutputArgs } from "./getRecord";
export const getRecord: typeof import("./getRecord").getRecord = null as any;
export const getRecordOutput: typeof import("./getRecord").getRecordOutput = null as any;
utilities.lazyLoad(exports, ["getRecord","getRecordOutput"], () => require("./getRecord"));

export { GetRecordsArgs, GetRecordsResult, GetRecordsOutputArgs } from "./getRecords";
export const getRecords: typeof import("./getRecords").getRecords = null as any;
export const getRecordsOutput: typeof import("./getRecords").getRecordsOutput = null as any;
utilities.lazyLoad(exports, ["getRecords","getRecordsOutput"], () => require("./getRecords"));

export { GetRegionArgs, GetRegionResult, GetRegionOutputArgs } from "./getRegion";
export const getRegion: typeof import("./getRegion").getRegion = null as any;
export const getRegionOutput: typeof import("./getRegion").getRegionOutput = null as any;
utilities.lazyLoad(exports, ["getRegion","getRegionOutput"], () => require("./getRegion"));

export { GetRegionsArgs, GetRegionsResult, GetRegionsOutputArgs } from "./getRegions";
export const getRegions: typeof import("./getRegions").getRegions = null as any;
export const getRegionsOutput: typeof import("./getRegions").getRegionsOutput = null as any;
utilities.lazyLoad(exports, ["getRegions","getRegionsOutput"], () => require("./getRegions"));

export { GetReservedIpArgs, GetReservedIpResult, GetReservedIpOutputArgs } from "./getReservedIp";
export const getReservedIp: typeof import("./getReservedIp").getReservedIp = null as any;
export const getReservedIpOutput: typeof import("./getReservedIp").getReservedIpOutput = null as any;
utilities.lazyLoad(exports, ["getReservedIp","getReservedIpOutput"], () => require("./getReservedIp"));

export { GetSizesArgs, GetSizesResult, GetSizesOutputArgs } from "./getSizes";
export const getSizes: typeof import("./getSizes").getSizes = null as any;
export const getSizesOutput: typeof import("./getSizes").getSizesOutput = null as any;
utilities.lazyLoad(exports, ["getSizes","getSizesOutput"], () => require("./getSizes"));

export { GetSpacesBucketArgs, GetSpacesBucketResult, GetSpacesBucketOutputArgs } from "./getSpacesBucket";
export const getSpacesBucket: typeof import("./getSpacesBucket").getSpacesBucket = null as any;
export const getSpacesBucketOutput: typeof import("./getSpacesBucket").getSpacesBucketOutput = null as any;
utilities.lazyLoad(exports, ["getSpacesBucket","getSpacesBucketOutput"], () => require("./getSpacesBucket"));

export { GetSpacesBucketObjectArgs, GetSpacesBucketObjectResult, GetSpacesBucketObjectOutputArgs } from "./getSpacesBucketObject";
export const getSpacesBucketObject: typeof import("./getSpacesBucketObject").getSpacesBucketObject = null as any;
export const getSpacesBucketObjectOutput: typeof import("./getSpacesBucketObject").getSpacesBucketObjectOutput = null as any;
utilities.lazyLoad(exports, ["getSpacesBucketObject","getSpacesBucketObjectOutput"], () => require("./getSpacesBucketObject"));

export { GetSpacesBucketObjectsArgs, GetSpacesBucketObjectsResult, GetSpacesBucketObjectsOutputArgs } from "./getSpacesBucketObjects";
export const getSpacesBucketObjects: typeof import("./getSpacesBucketObjects").getSpacesBucketObjects = null as any;
export const getSpacesBucketObjectsOutput: typeof import("./getSpacesBucketObjects").getSpacesBucketObjectsOutput = null as any;
utilities.lazyLoad(exports, ["getSpacesBucketObjects","getSpacesBucketObjectsOutput"], () => require("./getSpacesBucketObjects"));

export { GetSpacesBucketsArgs, GetSpacesBucketsResult, GetSpacesBucketsOutputArgs } from "./getSpacesBuckets";
export const getSpacesBuckets: typeof import("./getSpacesBuckets").getSpacesBuckets = null as any;
export const getSpacesBucketsOutput: typeof import("./getSpacesBuckets").getSpacesBucketsOutput = null as any;
utilities.lazyLoad(exports, ["getSpacesBuckets","getSpacesBucketsOutput"], () => require("./getSpacesBuckets"));

export { GetSshKeyArgs, GetSshKeyResult, GetSshKeyOutputArgs } from "./getSshKey";
export const getSshKey: typeof import("./getSshKey").getSshKey = null as any;
export const getSshKeyOutput: typeof import("./getSshKey").getSshKeyOutput = null as any;
utilities.lazyLoad(exports, ["getSshKey","getSshKeyOutput"], () => require("./getSshKey"));

export { GetSshKeysArgs, GetSshKeysResult, GetSshKeysOutputArgs } from "./getSshKeys";
export const getSshKeys: typeof import("./getSshKeys").getSshKeys = null as any;
export const getSshKeysOutput: typeof import("./getSshKeys").getSshKeysOutput = null as any;
utilities.lazyLoad(exports, ["getSshKeys","getSshKeysOutput"], () => require("./getSshKeys"));

export { GetTagArgs, GetTagResult, GetTagOutputArgs } from "./getTag";
export const getTag: typeof import("./getTag").getTag = null as any;
export const getTagOutput: typeof import("./getTag").getTagOutput = null as any;
utilities.lazyLoad(exports, ["getTag","getTagOutput"], () => require("./getTag"));

export { GetTagsArgs, GetTagsResult, GetTagsOutputArgs } from "./getTags";
export const getTags: typeof import("./getTags").getTags = null as any;
export const getTagsOutput: typeof import("./getTags").getTagsOutput = null as any;
utilities.lazyLoad(exports, ["getTags","getTagsOutput"], () => require("./getTags"));

export { GetVolumeArgs, GetVolumeResult, GetVolumeOutputArgs } from "./getVolume";
export const getVolume: typeof import("./getVolume").getVolume = null as any;
export const getVolumeOutput: typeof import("./getVolume").getVolumeOutput = null as any;
utilities.lazyLoad(exports, ["getVolume","getVolumeOutput"], () => require("./getVolume"));

export { GetVolumeSnapshotArgs, GetVolumeSnapshotResult, GetVolumeSnapshotOutputArgs } from "./getVolumeSnapshot";
export const getVolumeSnapshot: typeof import("./getVolumeSnapshot").getVolumeSnapshot = null as any;
export const getVolumeSnapshotOutput: typeof import("./getVolumeSnapshot").getVolumeSnapshotOutput = null as any;
utilities.lazyLoad(exports, ["getVolumeSnapshot","getVolumeSnapshotOutput"], () => require("./getVolumeSnapshot"));

export { GetVpcArgs, GetVpcResult, GetVpcOutputArgs } from "./getVpc";
export const getVpc: typeof import("./getVpc").getVpc = null as any;
export const getVpcOutput: typeof import("./getVpc").getVpcOutput = null as any;
utilities.lazyLoad(exports, ["getVpc","getVpcOutput"], () => require("./getVpc"));

export { KubernetesClusterArgs, KubernetesClusterState } from "./kubernetesCluster";
export type KubernetesCluster = import("./kubernetesCluster").KubernetesCluster;
export const KubernetesCluster: typeof import("./kubernetesCluster").KubernetesCluster = null as any;
utilities.lazyLoad(exports, ["KubernetesCluster"], () => require("./kubernetesCluster"));

export { KubernetesNodePoolArgs, KubernetesNodePoolState } from "./kubernetesNodePool";
export type KubernetesNodePool = import("./kubernetesNodePool").KubernetesNodePool;
export const KubernetesNodePool: typeof import("./kubernetesNodePool").KubernetesNodePool = null as any;
utilities.lazyLoad(exports, ["KubernetesNodePool"], () => require("./kubernetesNodePool"));

export { LoadBalancerArgs, LoadBalancerState } from "./loadBalancer";
export type LoadBalancer = import("./loadBalancer").LoadBalancer;
export const LoadBalancer: typeof import("./loadBalancer").LoadBalancer = null as any;
utilities.lazyLoad(exports, ["LoadBalancer"], () => require("./loadBalancer"));

export { MonitorAlertArgs, MonitorAlertState } from "./monitorAlert";
export type MonitorAlert = import("./monitorAlert").MonitorAlert;
export const MonitorAlert: typeof import("./monitorAlert").MonitorAlert = null as any;
utilities.lazyLoad(exports, ["MonitorAlert"], () => require("./monitorAlert"));

export { ProjectArgs, ProjectState } from "./project";
export type Project = import("./project").Project;
export const Project: typeof import("./project").Project = null as any;
utilities.lazyLoad(exports, ["Project"], () => require("./project"));

export { ProjectResourcesArgs, ProjectResourcesState } from "./projectResources";
export type ProjectResources = import("./projectResources").ProjectResources;
export const ProjectResources: typeof import("./projectResources").ProjectResources = null as any;
utilities.lazyLoad(exports, ["ProjectResources"], () => require("./projectResources"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { ReservedIpArgs, ReservedIpState } from "./reservedIp";
export type ReservedIp = import("./reservedIp").ReservedIp;
export const ReservedIp: typeof import("./reservedIp").ReservedIp = null as any;
utilities.lazyLoad(exports, ["ReservedIp"], () => require("./reservedIp"));

export { ReservedIpAssignmentArgs, ReservedIpAssignmentState } from "./reservedIpAssignment";
export type ReservedIpAssignment = import("./reservedIpAssignment").ReservedIpAssignment;
export const ReservedIpAssignment: typeof import("./reservedIpAssignment").ReservedIpAssignment = null as any;
utilities.lazyLoad(exports, ["ReservedIpAssignment"], () => require("./reservedIpAssignment"));

export { SpacesBucketArgs, SpacesBucketState } from "./spacesBucket";
export type SpacesBucket = import("./spacesBucket").SpacesBucket;
export const SpacesBucket: typeof import("./spacesBucket").SpacesBucket = null as any;
utilities.lazyLoad(exports, ["SpacesBucket"], () => require("./spacesBucket"));

export { SpacesBucketObjectArgs, SpacesBucketObjectState } from "./spacesBucketObject";
export type SpacesBucketObject = import("./spacesBucketObject").SpacesBucketObject;
export const SpacesBucketObject: typeof import("./spacesBucketObject").SpacesBucketObject = null as any;
utilities.lazyLoad(exports, ["SpacesBucketObject"], () => require("./spacesBucketObject"));

export { SpacesBucketPolicyArgs, SpacesBucketPolicyState } from "./spacesBucketPolicy";
export type SpacesBucketPolicy = import("./spacesBucketPolicy").SpacesBucketPolicy;
export const SpacesBucketPolicy: typeof import("./spacesBucketPolicy").SpacesBucketPolicy = null as any;
utilities.lazyLoad(exports, ["SpacesBucketPolicy"], () => require("./spacesBucketPolicy"));

export { SshKeyArgs, SshKeyState } from "./sshKey";
export type SshKey = import("./sshKey").SshKey;
export const SshKey: typeof import("./sshKey").SshKey = null as any;
utilities.lazyLoad(exports, ["SshKey"], () => require("./sshKey"));

export { TagArgs, TagState } from "./tag";
export type Tag = import("./tag").Tag;
export const Tag: typeof import("./tag").Tag = null as any;
utilities.lazyLoad(exports, ["Tag"], () => require("./tag"));

export { UptimeAlertArgs, UptimeAlertState } from "./uptimeAlert";
export type UptimeAlert = import("./uptimeAlert").UptimeAlert;
export const UptimeAlert: typeof import("./uptimeAlert").UptimeAlert = null as any;
utilities.lazyLoad(exports, ["UptimeAlert"], () => require("./uptimeAlert"));

export { UptimeCheckArgs, UptimeCheckState } from "./uptimeCheck";
export type UptimeCheck = import("./uptimeCheck").UptimeCheck;
export const UptimeCheck: typeof import("./uptimeCheck").UptimeCheck = null as any;
utilities.lazyLoad(exports, ["UptimeCheck"], () => require("./uptimeCheck"));

export { VolumeArgs, VolumeState } from "./volume";
export type Volume = import("./volume").Volume;
export const Volume: typeof import("./volume").Volume = null as any;
utilities.lazyLoad(exports, ["Volume"], () => require("./volume"));

export { VolumeAttachmentArgs, VolumeAttachmentState } from "./volumeAttachment";
export type VolumeAttachment = import("./volumeAttachment").VolumeAttachment;
export const VolumeAttachment: typeof import("./volumeAttachment").VolumeAttachment = null as any;
utilities.lazyLoad(exports, ["VolumeAttachment"], () => require("./volumeAttachment"));

export { VolumeSnapshotArgs, VolumeSnapshotState } from "./volumeSnapshot";
export type VolumeSnapshot = import("./volumeSnapshot").VolumeSnapshot;
export const VolumeSnapshot: typeof import("./volumeSnapshot").VolumeSnapshot = null as any;
utilities.lazyLoad(exports, ["VolumeSnapshot"], () => require("./volumeSnapshot"));

export { VpcArgs, VpcState } from "./vpc";
export type Vpc = import("./vpc").Vpc;
export const Vpc: typeof import("./vpc").Vpc = null as any;
utilities.lazyLoad(exports, ["Vpc"], () => require("./vpc"));


// Export enums:
export * from "./types/enums";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "digitalocean:index/app:App":
                return new App(name, <any>undefined, { urn })
            case "digitalocean:index/cdn:Cdn":
                return new Cdn(name, <any>undefined, { urn })
            case "digitalocean:index/certificate:Certificate":
                return new Certificate(name, <any>undefined, { urn })
            case "digitalocean:index/containerRegistry:ContainerRegistry":
                return new ContainerRegistry(name, <any>undefined, { urn })
            case "digitalocean:index/containerRegistryDockerCredentials:ContainerRegistryDockerCredentials":
                return new ContainerRegistryDockerCredentials(name, <any>undefined, { urn })
            case "digitalocean:index/customImage:CustomImage":
                return new CustomImage(name, <any>undefined, { urn })
            case "digitalocean:index/databaseCluster:DatabaseCluster":
                return new DatabaseCluster(name, <any>undefined, { urn })
            case "digitalocean:index/databaseConnectionPool:DatabaseConnectionPool":
                return new DatabaseConnectionPool(name, <any>undefined, { urn })
            case "digitalocean:index/databaseDb:DatabaseDb":
                return new DatabaseDb(name, <any>undefined, { urn })
            case "digitalocean:index/databaseFirewall:DatabaseFirewall":
                return new DatabaseFirewall(name, <any>undefined, { urn })
            case "digitalocean:index/databaseReplica:DatabaseReplica":
                return new DatabaseReplica(name, <any>undefined, { urn })
            case "digitalocean:index/databaseUser:DatabaseUser":
                return new DatabaseUser(name, <any>undefined, { urn })
            case "digitalocean:index/dnsRecord:DnsRecord":
                return new DnsRecord(name, <any>undefined, { urn })
            case "digitalocean:index/domain:Domain":
                return new Domain(name, <any>undefined, { urn })
            case "digitalocean:index/droplet:Droplet":
                return new Droplet(name, <any>undefined, { urn })
            case "digitalocean:index/dropletSnapshot:DropletSnapshot":
                return new DropletSnapshot(name, <any>undefined, { urn })
            case "digitalocean:index/firewall:Firewall":
                return new Firewall(name, <any>undefined, { urn })
            case "digitalocean:index/floatingIp:FloatingIp":
                return new FloatingIp(name, <any>undefined, { urn })
            case "digitalocean:index/floatingIpAssignment:FloatingIpAssignment":
                return new FloatingIpAssignment(name, <any>undefined, { urn })
            case "digitalocean:index/kubernetesCluster:KubernetesCluster":
                return new KubernetesCluster(name, <any>undefined, { urn })
            case "digitalocean:index/kubernetesNodePool:KubernetesNodePool":
                return new KubernetesNodePool(name, <any>undefined, { urn })
            case "digitalocean:index/loadBalancer:LoadBalancer":
                return new LoadBalancer(name, <any>undefined, { urn })
            case "digitalocean:index/monitorAlert:MonitorAlert":
                return new MonitorAlert(name, <any>undefined, { urn })
            case "digitalocean:index/project:Project":
                return new Project(name, <any>undefined, { urn })
            case "digitalocean:index/projectResources:ProjectResources":
                return new ProjectResources(name, <any>undefined, { urn })
            case "digitalocean:index/reservedIp:ReservedIp":
                return new ReservedIp(name, <any>undefined, { urn })
            case "digitalocean:index/reservedIpAssignment:ReservedIpAssignment":
                return new ReservedIpAssignment(name, <any>undefined, { urn })
            case "digitalocean:index/spacesBucket:SpacesBucket":
                return new SpacesBucket(name, <any>undefined, { urn })
            case "digitalocean:index/spacesBucketObject:SpacesBucketObject":
                return new SpacesBucketObject(name, <any>undefined, { urn })
            case "digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy":
                return new SpacesBucketPolicy(name, <any>undefined, { urn })
            case "digitalocean:index/sshKey:SshKey":
                return new SshKey(name, <any>undefined, { urn })
            case "digitalocean:index/tag:Tag":
                return new Tag(name, <any>undefined, { urn })
            case "digitalocean:index/uptimeAlert:UptimeAlert":
                return new UptimeAlert(name, <any>undefined, { urn })
            case "digitalocean:index/uptimeCheck:UptimeCheck":
                return new UptimeCheck(name, <any>undefined, { urn })
            case "digitalocean:index/volume:Volume":
                return new Volume(name, <any>undefined, { urn })
            case "digitalocean:index/volumeAttachment:VolumeAttachment":
                return new VolumeAttachment(name, <any>undefined, { urn })
            case "digitalocean:index/volumeSnapshot:VolumeSnapshot":
                return new VolumeSnapshot(name, <any>undefined, { urn })
            case "digitalocean:index/vpc:Vpc":
                return new Vpc(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("digitalocean", "index/app", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/cdn", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/certificate", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/containerRegistry", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/containerRegistryDockerCredentials", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/customImage", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/databaseCluster", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/databaseConnectionPool", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/databaseDb", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/databaseFirewall", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/databaseReplica", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/databaseUser", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/dnsRecord", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/domain", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/droplet", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/dropletSnapshot", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/firewall", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/floatingIp", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/floatingIpAssignment", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/kubernetesCluster", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/kubernetesNodePool", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/loadBalancer", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/monitorAlert", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/project", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/projectResources", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/reservedIp", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/reservedIpAssignment", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/spacesBucket", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/spacesBucketObject", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/spacesBucketPolicy", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/sshKey", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/tag", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/uptimeAlert", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/uptimeCheck", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/volume", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/volumeAttachment", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/volumeSnapshot", _module)
pulumi.runtime.registerResourceModule("digitalocean", "index/vpc", _module)
pulumi.runtime.registerResourcePackage("digitalocean", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:digitalocean") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
